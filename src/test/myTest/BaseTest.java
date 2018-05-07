package myTest;

import core.Singleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected WebDriver driver = Singleton.getInstance().getDriver();


    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

//    @Parameters("browser")
//    @BeforeClass
//    public WebDriver beforeClass(String browser) {

//            if (browser.equals("chrome")) {
//                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
//                driver = new ChromeDriver();
//            } else if (browser.equals("firefox")) {
//                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
//                driver = new FirefoxDriver();
//            } else if (browser.equals("ie")) {
//                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
//                driver = new InternetExplorerDriver();
//            }


//        return driver;
//    }


    @AfterMethod
    public void closeDriver() {
        Singleton.getInstance().destroy();
        System.out.println("After Method");
    }

    @AfterTest
    public void closeDriverTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public void tearDown() {

        System.out.println("After Class");
    }

}
