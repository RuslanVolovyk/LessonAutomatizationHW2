package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 25.03.2018.
 */
public class DriverInit implements Options {
    public static WebDriver driver;

    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/main/resources/drivers/gjh.exe";
    public static final String DRIVER_NAME_CHROME = "webdriver.chrome.driver";
    /**
     * There is setting driver by name
     */
    public synchronized WebDriver setDriver() {
        System.setProperty(DRIVER_NAME_CHROME, CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
    public DriverInit copy() {
        return new DriverInit();
    }
}
