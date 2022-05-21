package day_14;

import day_12.BrowserFactory;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class AllureListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        takeScreenshot();
        getSourceTree();
    }

    private void takeScreenshot() {
        Allure.addAttachment("Page screenshot", new ByteArrayInputStream(((TakesScreenshot) BrowserFactory.getChromeDriver()).getScreenshotAs(OutputType.BYTES)));
    }

    private void getSourceTree() {
        Allure.addAttachment("DOM Tree", BrowserFactory.getChromeDriver().getPageSource());
    }
}
