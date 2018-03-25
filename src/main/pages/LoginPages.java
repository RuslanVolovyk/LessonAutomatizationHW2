package pages;

import core.GeneralActions;
import core.Utils;
import org.openqa.selenium.By;

/**
 * Created by Администратор on 25.03.2018.
 */
public class LoginPages extends GeneralActions {
    private By inputValue = By.xpath("//*[@id=\"lst-ib\"]");
    private By searchInput =By.id("searchInput");

    public void goToGoogle() {
        navigate(Utils.getURL());
        getWebElement(inputValue).sendKeys("Кокос");
        getWebElement(inputValue).submit();
    }

    public void goToWiki() {
        navigate(Utils.getUrlwiki());
        getWebElement(searchInput).sendKeys("Banana");
        waitForElementToBeClickable(searchInput);
        getWebElement(searchInput).submit();

    }
}
