package pages;

import core.CustomTestListener;
import core.GeneralActions;
import core.Utils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import java.util.Random;

/**
 * Created by Администратор on 25.03.2018.
 */

public class LoginPages extends GeneralActions {
    private By inputValue = By.xpath("//*[@id=\"lst-ib\"]");
    private By searchInput = By.id("searchInput");

    @Step("goToGoogle")
    public void goToGoogle() {
        navigate(Utils.getURL());
        getWebElement(inputValue).sendKeys("Кокос");
        getWebElement(inputValue).submit();
        Assert.assertEquals(driver.getTitle(), Utils.GOOGLETITLE);
    }

    @Step("goToWiki")
    public void goToWiki() throws InterruptedException {
        navigate(Utils.getUrlwiki());
        isDisplayed(searchInput);
        getWebElement(searchInput).sendKeys("Banana");
        System.out.println(isDisplayed(searchInput));
        waitForContentLoad(searchInput);
        getWebElement(searchInput).submit();
    }


    public static void main(String[] args) {

        Random r = new Random();
        double random = (1.99 * r.nextDouble());
        System.out.println(random);

    }
}
