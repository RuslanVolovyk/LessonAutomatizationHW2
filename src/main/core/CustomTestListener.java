package core;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomTestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result){
        saveScreenshot(result);
    }

    @Override
    public void onTestSuccess(ITestResult result){
        saveScreenshot(result);
    }

    @Override
    public void onTestSkipped(ITestResult result){
        saveScreenshot(result);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(ITestResult result){

        WebDriver driver = Singleton.getInstance().getDriver();
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}

