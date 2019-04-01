package pages;

import core.GeneralActions;
import core.Utils;
import org.openqa.selenium.By;

public class RabotaPage extends GeneralActions {

    private By logIn = By.xpath("//i[@class='fi-profile']");
    private By emailInput = By.xpath("//input[@id='ctl00_Sidebar_login_txbLogin']");
    private By passwordInput = By.xpath("//input[@id='ctl00_Sidebar_login_txbPassword']");
    private By logInButton = By.xpath("//a[@id='ctl00_Sidebar_login_lnkLogin']");
    private By logo = By.xpath("//a[@class='f-header-logo fd-f-center-middle']");


    public void login() {

        getWebElement(logIn).click();
        waitForContentLoad(emailInput);
        getWebElement(emailInput).sendKeys(Utils.LOGINFORRABOTA);
        getWebElement(passwordInput).sendKeys(Utils.LOGINFORRABOTA);
        getWebElement(logInButton).click();
        waitForContentLoad(logo);

    }

    public void openSite(){
        navigate(Utils.URLRABOTA);
    }
}
