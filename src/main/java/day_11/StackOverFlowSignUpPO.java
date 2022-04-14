package day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class StackOverFlowSignUpPO {

    public static StackOverflowTestBO stackOverflowTestBO;

    public static void verifySignUpPage() {
        WebElement joinCommunityPageTitle = stackOverflowTestBO.chromeDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
        Assert.assertTrue(joinCommunityPageTitle.isDisplayed());
    }
}
