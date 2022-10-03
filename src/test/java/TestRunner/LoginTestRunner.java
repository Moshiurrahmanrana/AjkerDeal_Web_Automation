package TestRunner;

import Setup.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends Setup {
    LoginPage loginPage;
    @Test
    public void doLogin() {
        driver.get("https://www.ajkerdeal.com/");
        loginPage = new LoginPage(driver);
        loginPage.doLogin();
    }
}
