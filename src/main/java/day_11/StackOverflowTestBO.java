package day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StackOverflowTestBO {
    public static ChromeDriver chromeDriver;

    public static StackOverflowHomePO stackOverflowHomePO;
    private static StackOverFlowSignUpPO stackOverflowSignUpPO;

    public static void goToHomePage() {
        stackOverflowHomePO.goToHomePage();
    }
    public static void acceptCookies() {
        stackOverflowHomePO.acceptCookies();
    }
    public static void clickSignUp() {
        stackOverflowHomePO.clickSignUp();
    }
    public static void verifySignUpPage() {
        stackOverflowSignUpPO.verifySignUpPage();
    }
}
