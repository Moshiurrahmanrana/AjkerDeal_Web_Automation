package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//a[contains(text(),'ENG')]")
    public WebElement translateEng;
    @FindBy(id = "logdata")
    public WebElement linkLogin;
    @FindBy(id = "Email")
    public WebElement emailBox;
    @FindBy(id = "Password")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@value='Login']")
    public WebElement signIn;
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void doLogin() {
        translateEng.click();
        linkLogin.click();
        emailBox.sendKeys("rahman.moshiur.riseuplabs@gmail.com");
        passwordBox.sendKeys("p@ssword123");
        signIn.click();
    }
}
