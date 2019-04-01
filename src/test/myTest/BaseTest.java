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


    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

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

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("BeforeSuite");
    }
 @AfterSuite
    public void afterSuite() {

        System.out.println("AfterSuite");
    }



}
