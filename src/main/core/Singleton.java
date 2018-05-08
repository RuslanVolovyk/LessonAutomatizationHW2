package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 25.03.2018.
 */
@Listeners({CustomTestListener.class})
public class Singleton extends Options {
    private static final String IE_DRIVER_PATH = System.getProperty("user.dir") + "/src/main/resources/drivers/IEDriverServer.exe";
    private static final String DRIVER_NAME_IE = "webdriver.ie.driver";

    private static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe";
    private static final String DRIVER_NAME_CHROME = "webdriver.chrome.driver";

    private static Singleton instance = null;
    private WebDriver driver;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String getFileName (){
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss");
        Date date = new Date();
        return dateFormat.format(date);

    }


    public WebDriver getDriver() {
        if (driver == null) {
            driver = setDriver();
            return driver;
        } else {
            return driver;
        }
    }

    private synchronized WebDriver setDriver() {
//        System.setProperty(DRIVER_NAME_CHROME, CHROME_DRIVER_PATH);
//        driver = new ChromeDriver(chromeOptions());


        System.setProperty(DRIVER_NAME_IE, IE_DRIVER_PATH);
        driver = new InternetExplorerDriver();




        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler eventHandler = new EventHandler() {
        };
        driver = eventDriver.register(eventHandler);

        return driver;
    }

    public void destroy() {
        if (driver != null) {
            getDriver().quit();
            driver = null;
        }
    }
}
