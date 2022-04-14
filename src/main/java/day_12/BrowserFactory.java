package day_12;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    private static final ThreadLocal<WebDriver> INSTANCE = new InheritableThreadLocal<>();
    public static WebDriver getChromeDriver() {
        if(INSTANCE.get() == null) {
            throw new RuntimeException("Instance was not initialized");
        }
        return INSTANCE.get();
    }
    public static void initChromeBrowser() {
        ChromeDriverManager.getInstance().setup();
        INSTANCE.set(new ChromeDriver());
    }
}
