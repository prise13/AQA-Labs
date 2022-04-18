package aqa_tests.ui_test;

import day_11.StackOverflowTestBO;
import day_12.BrowserFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StackOverflowSecondTest {

    @DataProvider
    Object[][] testDataProvider() {
        return new Object[][] {
                {"User1", "Hapipo"},
                {"User2", "Hapupo"}
        };
    }

    @BeforeTest
    void init() {
        BrowserFactory.initChromeBrowser();
    }

    @Test(dataProvider = "testDataProvider")
    void stackOverflowTest(String userLogin, String password) {
        StackOverflowTestBO stackOverflowTestBO = new StackOverflowTestBO();
        // Step 1: Go to stackoverflow.com
        stackOverflowTestBO.goToHomePage();
        // Step 2: Accept cookies
        stackOverflowTestBO.acceptCookies();
        // Step 3: Click "Join community button"
        stackOverflowTestBO.clickSignUp();
        // Step 4: Verify we are on join community page
        stackOverflowTestBO.verifySignUpPage();
    }

    @AfterTest
    void closeSession() {
        BrowserFactory.getChromeDriver().close();
        BrowserFactory.getChromeDriver().quit();
    }
}