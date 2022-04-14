package day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static day_11.StackOverflowTestBO.chromeDriver;

public class StackOverflowHomePO {

    public static StackOverflowTestBO stackOverflowTestBO;

    public static void goToHomePage() {
        stackOverflowTestBO.chromeDriver.get("https://stackoverflow.com/");
    }
    public static void acceptCookies() {
        try {
            WebElement acceptCookiesButton = stackOverflowTestBO.chromeDriver.findElement(By.xpath("/html/body/div[4]/div/button[1]"));
            acceptCookiesButton.click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clickSignUp() {
        WebElement joinCommunityButton = stackOverflowTestBO.chromeDriver.findElement(By.xpath("//*[@id=\"content\"]/header/div/div[1]/div[1]/div/a"));
        joinCommunityButton.click();
    }

}
