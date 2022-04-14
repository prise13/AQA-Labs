package day_11;

import day_12.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StackOverflowTestBO {

    private final static StackOverflowHomePO stackOverflowHomePO = new StackOverflowHomePO();
    private final  static StackOverFlowSignUpPO stackOverflowSignUpPO = new StackOverFlowSignUpPO();

    @FindBy(xpath = "/html/body/div[4]/div/button[1]")
    private static WebElement acceptCookiesButton;

    public StackOverflowTestBO() {
        PageFactory.initElements(BrowserFactory.getChromeDriver(), this);
    }

    public static void goToHomePage() {
        stackOverflowHomePO.goToHomePage();
    }
    public static void acceptCookies() {
        try {
            acceptCookiesButton.click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clickSignUp() {
        stackOverflowHomePO.clickSignUp();
    }
    public static void verifySignUpPage() {
        stackOverflowSignUpPO.verifySignUpPage();
    }
}
