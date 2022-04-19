package aqa_tests.ui_test;


import day_11.InstagramAuthTestBO;
import day_12.BrowserFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InstagramAuthTest {

    @BeforeTest
    void init() {
        BrowserFactory.initChromeBrowser();
    }

    @DataProvider
    Object[][] instagramAuthProvider() {
        return new Object[][] {
                {"User1123", "Hapipo"},
                {"User2123", "Hapupo"},
                {"123","123"},
                {"aqatest12", "AQAAuthenticationTest"}
        };
    }

    @Test(dataProvider = "instagramAuthProvider")
    void instagramAuthTest(String login, String password) {
        InstagramAuthTestBO instagramAuthTestBO = new InstagramAuthTestBO();
        instagramAuthTestBO
                .openLoginPage()
                .login(login, password)
                .verifyLogin();
    }

    @AfterTest
    void closeSession() {
        BrowserFactory.getChromeDriver().close();
        BrowserFactory.getChromeDriver().quit();
    }
}
