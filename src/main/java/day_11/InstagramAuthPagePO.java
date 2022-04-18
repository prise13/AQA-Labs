package day_11;

import day_12.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramAuthPagePO {
    private WebDriver chromeDriver = BrowserFactory.getChromeDriver();

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[1]/div/label/input")
    private WebElement loginInput;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[2]/div/label/input")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]/button")
    private WebElement loginButton;

    public InstagramAuthPagePO() {
        PageFactory.initElements(BrowserFactory.getChromeDriver(), this);
    }

    public void goToLoginPage() {
        chromeDriver.get("https://www.instagram.com/");
    }
    public void login(String login, String password) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}