package day_11;

import day_12.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StackOverFlowSignUpPO {

    public static StackOverflowTestBO stackOverflowTestBO;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/h1")
    private static WebElement joinCommunityPageTitle;

    public StackOverFlowSignUpPO() {
        PageFactory.initElements(BrowserFactory.getChromeDriver(), this);
    }

    public static void verifySignUpPage() {
        Assert.assertTrue(joinCommunityPageTitle.isDisplayed());
    }
}
