package aqa_tests.ui_test;

import day_11.StackOverflowTestBO;
import day_12.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class StackOverflowTest {

    @BeforeTest
    void init() {
        BrowserFactory.initChromeBrowser();
    }

    @Test
    void stackOverflowTest() {
        StackOverflowTestBO stackOverflowTestBO = new StackOverflowTestBO();
        stackOverflowTestBO.goToHomePage();
        stackOverflowTestBO.acceptCookies();
        stackOverflowTestBO.clickSignUp();
        stackOverflowTestBO.acceptCookies();
        stackOverflowTestBO.verifySignUpPage();
    }

    @AfterTest
    void closeSession() {
        BrowserFactory.getChromeDriver().close();
        BrowserFactory.getChromeDriver().quit();
    }
}
