package myTest;


import core.CustomTestListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPages;
import pages.MoikrugPage;
import pages.RabotaPage;
import pages.WorkPage;


@Listeners({CustomTestListener.class})
@Epic("Regression Tests")
@Feature("Login Tests")
public class GoogleTest extends BaseTest {

    @Severity(SeverityLevel.BLOCKER)
    @Description("Test openGooglePageTest")
    @Test
    public void openGooglePageTest() throws InterruptedException {
        LoginPages page = new LoginPages();
        page.goToGoogle();
        System.out.println("Test");


    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Test workUaTest")
    @Test
    public void workUaTest()  {
        WorkPage workPage = new WorkPage();
        workPage.openSite();
        workPage.login();


    }

    @Severity(SeverityLevel.MINOR)
    @Test
    @Story("Test rabotaUaTest")
    public void rabotaUaTest()  {
        RabotaPage rabotaPage = new RabotaPage();
        rabotaPage.openSite();
        rabotaPage.login();
    }

    @Severity(SeverityLevel.MINOR)
    @Test
    @Story("Test rabotaUaTest")
    public void moiKrugTest()  {
        MoikrugPage moikrugPage = new MoikrugPage();
        moikrugPage.openSite();
        moikrugPage.login();
    }
}
