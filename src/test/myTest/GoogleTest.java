package myTest;

import org.testng.annotations.Test;
import pages.LoginPages;

/**
 * Created by Администратор on 25.03.2018.
 */
public class GoogleTest extends BaseTest {
    @Test
    public void openGooglePageTest() {
        LoginPages page = new LoginPages();
        page.goToGoogle();
    }

    @Test
    public void openWikiPageTest() {
        LoginPages page = new LoginPages();
        page.goToWiki();
    }
}
