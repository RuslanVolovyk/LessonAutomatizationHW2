package core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Администратор on 25.03.2018.
 */
public class GeneralActions extends StopWatch {
    protected WebDriver driver = Singleton.getInstance().getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 15);
    private static StringBuilder builder;

    protected void navigate(String url) {
        driver.navigate().to(url);
    }

    protected WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public void waitForContentLoad(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    protected boolean isDisplayed(By locator) throws InterruptedException {
        boolean isVisible = false;
        start();
        while (getElapsedTimeSecs() < 6) {
            try {
                boolean displayed = driver.findElement(locator).isDisplayed();
                if (displayed) {
                    stop();
                    return true;
                }
            } catch (NoSuchElementException e) {
                Thread.sleep(1500);
                isVisible = false;
            }
        }
        stop();
        return isVisible;

    }

    protected boolean isEnabled(By locator) throws InterruptedException {
        boolean isVisible = false;
        start();
        while (getElapsedTimeSecs() < 6) {
            try {
                boolean displayed = driver.findElement(locator).isEnabled();
                if (displayed) {
                    stop();
                    return true;
                }
            } catch (NoSuchElementException e) {
                Thread.sleep(1500);
                isVisible = false;
            }
        }
        stop();
        return isVisible;

    }

    protected boolean isSelected(By locator) throws InterruptedException {
        boolean isVisible = false;
        start();
        while (getElapsedTimeSecs() < 6) {
            try {
                boolean displayed = driver.findElement(locator).isSelected();
                if (displayed) {
                    stop();
                    return true;
                }
            } catch (NoSuchElementException e) {
                Thread.sleep(1500);
                isVisible = false;
            }
        }
        stop();
        return isVisible;

    }

    //generate random email address
    private static String randomEmailAddress() {
        Set<String> identifiers = new HashSet<>();
        Random rand = new Random();
        builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5) + 5;
            for (int i = 0; i < length; i++) {
                builder.append(Utils.WORDSFOREMAIL.charAt(rand.nextInt(Utils.WORDSFOREMAIL.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        String randomEmailAddress = builder.toString() + "@gmail.com";
        return randomEmailAddress;
    }

}
