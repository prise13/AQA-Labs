package day_11;

import day_12.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class InstagramMainPagePO {

    private WebDriver chromeDriver = BrowserFactory.getChromeDriver();

    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav")
    WebElement header;

    public InstagramMainPagePO() {
        PageFactory.initElements(BrowserFactory.getChromeDriver(), this);
    }

    public void verifyLogin() {
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/section/nav")));
        Assert.assertTrue(header.isDisplayed());
    }
}
