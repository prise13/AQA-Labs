package day_11;

public class InstagramAuthTestBO {

    private final InstagramAuthPagePO instagramAuthPagePO = new InstagramAuthPagePO();
    private final InstagramMainPagePO instagramMainPagePO = new InstagramMainPagePO();

    public InstagramAuthTestBO openLoginPage() {
        instagramAuthPagePO.goToLoginPage();
        return this;
    }

    public InstagramAuthTestBO login(String login, String password) {
        instagramAuthPagePO.login(login, password);
        return this;
    }

    public InstagramAuthTestBO verifyLogin() {
        instagramMainPagePO.verifyLogin();
        return this;
    }

}
