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
    private WebDriverWait wait = new WebDriverWait(driver, 30);

    private final static String wordsMail = "ghjsnsmyudhkjtymnmdsmnrshyjftyjfty";
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

    public boolean waitForpresenceOfElementLocated(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));

        return false;
    }


    protected boolean isDisplayed(By locator) throws InterruptedException{
        boolean isVisible = false;
        start();
        while (getElapsedTimeSecs() < 15) {
            try {
              boolean displayed = driver.findElement(locator).isDisplayed();
                if (displayed){
                    stop();
                    return true;
                }
                Thread.sleep(1000);
            } catch (NoSuchElementException e) {
                Thread.sleep(1000);
                 isVisible = false;
            }
        }
               stop();
        return isVisible;

    }

    protected boolean isEnabled(By locator) {
        boolean isEnabled;
        start();
        while (getElapsedTimeSecs() < 3) {
            try {
                driver.findElement(locator).isEnabled();
            } catch (NoSuchElementException e) {
                return isEnabled = false;
            }
        }
        isEnabled = true;
        stop();
        return isEnabled;
    }


    private static String randomStringFirstName() {
        Set<String> identifiers = new HashSet<String>();
        Random rand = new Random();
        builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5) + 5;
            for (int i = 0; i < length; i++) {
                builder.append(wordsMail.charAt(rand.nextInt(wordsMail.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }

        }
        String s = builder.toString() + "@gmail.com";
        return s;
    }

    public static void main(String[] args) {

        System.out.println(randomStringFirstName());
    }

}
