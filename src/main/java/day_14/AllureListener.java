package day_14;

import day_12.BrowserFactory;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        takeScreenshot();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] takeScreenshot() {
        System.out.println("Taking screenshot");
            return ((TakesScreenshot) BrowserFactory.getChromeDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
