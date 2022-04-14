package aqa_tests.ui_test;

import day_11.StackOverflowTestBO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class StackOverflowTest {

    private StackOverflowTestBO stackOverflowTestBO;


    @BeforeTest
    void init() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/Lab1/src/main/java/drivers/chromedriver.exe");
        stackOverflowTestBO.chromeDriver = new ChromeDriver();
    }

    @Test
    void stackOverflowTest() {
        stackOverflowTestBO.goToHomePage();
        stackOverflowTestBO.acceptCookies();
        stackOverflowTestBO.clickSignUp();
        stackOverflowTestBO.verifySignUpPage();
    }

    @AfterTest
    void closeSession() {
        stackOverflowTestBO.chromeDriver.close();
        stackOverflowTestBO.chromeDriver.quit();
    }
}
