package myTest;

import core.Singleton;
import org.testng.annotations.*;

public class BaseTest {

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

        System.out.println("Before Class");
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

}
