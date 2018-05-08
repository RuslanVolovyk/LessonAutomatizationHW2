package myTest;


import core.CustomTestListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPages;



@Listeners({CustomTestListener.class})
@Epic("Regression Tests")
@Feature("Login Tests")
public class GoogleTest extends BaseTest {

    @Severity(SeverityLevel.BLOCKER)
    @Description("Test openGooglePageTest")
    @Test
    public void openGooglePageTest() {
        LoginPages page = new LoginPages();
        page.goToGoogle();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Test openWikiPageTest")
    @Test
    public void openWikiPageTest() throws InterruptedException {
        LoginPages page = new LoginPages();
        page.goToWiki();
    }

    @Severity(SeverityLevel.MINOR)
    @Test
    @Story("Invalid username and password login test")
    public void openWikiPageTest2() throws InterruptedException {
        LoginPages page = new LoginPages();
        page.goToWiki();
    }
}
