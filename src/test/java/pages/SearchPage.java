package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    @FindBy(xpath = "//a[contains(text(),'ENG')]")
    public WebElement translateEng;
    @FindBy(id = "txtName")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement searchButton;
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void findProducts() {
        translateEng.click();
        searchBox.sendKeys("pants");
        searchButton.click();
    }
}
