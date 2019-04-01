package pages;

import core.GeneralActions;
import core.Utils;
import org.openqa.selenium.By;

public class WorkPage extends GeneralActions {

    private By logIn = By.xpath(".//a[contains(text(), 'Войти')]");
    private By logInButton = By.xpath("//button[@class='btn btn-default btn-block']");
    private By emailInput = By.id("email");
    private By passwordInput = By.xpath("//input[@id='password']");
    private By logo = By.id("logo-emp");


    public void openSite(){
        navigate(Utils.URL_WORK);
    }

    public void login() {
        getWebElement(logIn).click();
        getWebElement(emailInput).sendKeys(Utils.LOGIN_FOR_WORK);
        getWebElement(passwordInput).sendKeys(Utils.PASSWORD_FOR_WORK);
        getWebElement(logInButton).click();
        waitForContentLoad(logo);

    }
}
