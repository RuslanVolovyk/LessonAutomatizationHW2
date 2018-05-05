package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 25.03.2018.
 */
public class Singleton extends Options {
    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe";
    public static final String DRIVER_NAME_CHROME = "webdriver.chrome.driver";
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


    public WebDriver getDriver() {
        if (driver == null) {
            driver = setDriver();
            return driver;
        } else {
            return driver;
        }
    }
    @Parameters("browser")
    public synchronized WebDriver setDriver() {
        System.setProperty(DRIVER_NAME_CHROME, CHROME_DRIVER_PATH);
        driver = new ChromeDriver(chromeOptions());

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
