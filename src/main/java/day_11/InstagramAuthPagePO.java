package day_11;

import day_12.BrowserFactory;
import day_12.decorators.CustomFieldDecorator;
import day_12.decorators.WebButton;
import day_12.decorators.WebInput;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InstagramAuthPagePO {
    private WebDriver chromeDriver = BrowserFactory.getChromeDriver();

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[1]/div/label/input")
    private WebInput loginInput;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[2]/div/label/input")
    private WebInput passwordInput;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]/button")
    private WebButton loginButton;

    public InstagramAuthPagePO() {
        PageFactory.initElements(new CustomFieldDecorator(BrowserFactory.getChromeDriver()), this);
    }

    public void goToLoginPage() {
        chromeDriver.get("https://www.instagram.com/");
    }
    public void login(String login, String password) {
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")));
        }
        catch (TimeoutException e) {
            e.printStackTrace();
        }
        loginInput.fillWith(login);
        passwordInput.fillWith(password);
        loginButton.press();
    }
}
