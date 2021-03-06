package aqa_tests.ui_test;


import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import day_11.InstagramAuthTestBO;
import day_12.BrowserFactory;
import day_13.listeners.CustomSuiteListener;
import day_13.listeners.CustomTestListener;
import day_14.AllureListener;
import org.testng.annotations.*;

@Listeners({
        UniversalVideoListener.class,
        CustomSuiteListener.class,
        CustomTestListener.class,
        AllureListener.class
})
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
    @Video(name="Instagram_auth")
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
