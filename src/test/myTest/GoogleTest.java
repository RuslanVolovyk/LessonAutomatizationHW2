package myTest;


import core.CustomTestListener;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPages;

/**
 * Created by Администратор on 25.03.2018.
 */
@Listeners({CustomTestListener.class})
public class GoogleTest extends BaseTest {

    @Severity(SeverityLevel.BLOCKER)
    @Description("My description Test document!!!!!!!")
    @Test
    public void openGooglePageTest() {
        LoginPages page = new LoginPages();
        page.goToGoogle();

    }


    @Test
    public void openWikiPageTest() throws InterruptedException {
        LoginPages page = new LoginPages();
        page.goToWiki();
    }
}
