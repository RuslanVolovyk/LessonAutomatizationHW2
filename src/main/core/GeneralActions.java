package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Администратор on 25.03.2018.
 */
public class GeneralActions {
    protected WebDriver driver = Singleton.getInstance().getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 30);


    protected void navigate(String url) {
        driver.navigate().to(url);
    }

    protected WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public void waitForContentLoad(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void waitForElementToBeClickable(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
