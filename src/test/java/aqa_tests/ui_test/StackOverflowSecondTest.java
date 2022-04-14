package aqa_tests.ui_test;

import day_11.StackOverflowTestBO;
import day_12.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StackOverflowSecondTest {

    private StackOverflowTestBO stackOverflowTestBO;


    @BeforeTest
    void init() {
        BrowserFactory.initChromeBrowser();
    }

    @Test(dataProvider = "testDataProvider")
    void stackOverflowTest(String userLogin) {
        stackOverflowTestBO.goToHomePage();
        stackOverflowTestBO.acceptCookies();
        stackOverflowTestBO.clickSignUp();
        stackOverflowTestBO.verifySignUpPage();
    }

    @AfterTest
    void closeSession() {
        BrowserFactory.getChromeDriver().close();
        BrowserFactory.getChromeDriver().quit();
    }
}