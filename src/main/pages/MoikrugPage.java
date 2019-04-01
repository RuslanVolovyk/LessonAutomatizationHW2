package pages;


import core.GeneralActions;
import core.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MoikrugPage extends GeneralActions {

    private By logIn = By.xpath("//a[@class='link sign_in']");
    private By logInButton = By.xpath("//button[@class='button btn-blue']");
    private By emailInput = By.id("user_email");
    private By passwordInput = By.id("user_password");
    private By logo = By.id("Слой_1");



    public void openSite(){
        navigate(Utils.URLMOIKRUG);
    }

    public void login() {
        getWebElement(logIn).click();
        getWebElement(emailInput).sendKeys(Utils.LOGINFORMOIKRUG);
        getWebElement(passwordInput).sendKeys(Utils.PASSWORDFORMOIKRUG);
        getWebElement(logInButton).click();
        waitForContentLoad(logo);
    }

//    public void readData(NotificationData notificationData) {
//        List<WebElement> userId = driver.findElements(getIdUser);
//
//        final List<com.andersen.cv.data.CV> cvs = new ArrayList(userId.size());
//
//        for (WebElement anUserId : userId) {
//            String id = String.valueOf(anUserId.getAttribute("data-resume-id"));
//
//            com.andersen.cv.data.CV cv = new com.andersen.cv.data.CV(id);
//            System.out.println("CV " + cv);
//            cvs.add(cv);
//        }
//        synchronized (cvCollection) {
//            cvCollection.addAllAndSendNotificationIfNeeded(cvs, notificationData);
//        }
   // }
}
