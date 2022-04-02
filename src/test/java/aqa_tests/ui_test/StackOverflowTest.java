package aqa_tests.ui_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class StackOverflowTest {

    ChromeDriver chromeDriver;

    @BeforeTest
    void init() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/Lab1/src/main/java/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @Test
    void stackOverflowTest() {
        chromeDriver.get("https://stackoverflow.com/");
        try {
            WebElement acceptCookiesButton = chromeDriver.findElement(By.xpath("/html/body/div[5]/div/button[1]"));
            acceptCookiesButton.click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        WebElement joinCommunityButton = chromeDriver.findElement(By.xpath("//*[@id=\"content\"]/header/div/div[1]/div[1]/div/a"));
        joinCommunityButton.click();
        WebElement joinCommunityPageTitle = chromeDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
        Assert.assertTrue(joinCommunityPageTitle.isDisplayed());
        Assert.assertEquals(joinCommunityPageTitle.getText(), "Join the Stack Overflow community");
    }

    @AfterTest
    void closeSession() {
        chromeDriver.close();
        chromeDriver.quit();
    }
}
