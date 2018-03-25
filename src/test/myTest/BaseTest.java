package myTest;

import org.testng.annotations.*;
import static core.DriverInit.*;

public class BaseTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void beforeMethod() {
//        driver = setDriver();
        System.out.println("Before Method");
    }
    @BeforeClass
    public void beforeClass() {

        System.out.println("Before Class");
    }
    @AfterMethod
    public void closeDriver() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.close();
        }
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
