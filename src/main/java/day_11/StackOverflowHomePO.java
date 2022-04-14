package day_11;

import day_12.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StackOverflowHomePO {

    public static StackOverflowTestBO stackOverflowTestBO;
    public static WebDriver chromeDriver = BrowserFactory.getChromeDriver();

    @FindBy(xpath = "//*[@id=\"content\"]/header/div/div[1]/div[1]/div/a")
    private static WebElement joinCommunityButton;

    public StackOverflowHomePO() {
        PageFactory.initElements(BrowserFactory.getChromeDriver(), this);
    }

    public static void goToHomePage() {
        chromeDriver.get("https://stackoverflow.com/");
    }

    public static void clickSignUp() {
        joinCommunityButton.click();
    }

}
