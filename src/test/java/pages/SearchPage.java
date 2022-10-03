package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    @FindBy(id = "txtName")
    public WebElement searchBox;
    @FindBy(xpath = "//li[@id='ui-id-20']//a")
    public WebElement selectProduct;

    @FindBy(xpath = "//h1[@class='category-total-count-text']")
    public WebElement productFound;
    WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String findProducts(){
        searchBox.sendKeys("pants");
        selectProduct.click();
        return productFound.getText();
    }
}
