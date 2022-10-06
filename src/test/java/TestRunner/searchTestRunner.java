package TestRunner;

import Setup.Setup;
import org.testng.annotations.Test;
import pages.SearchPage;

public class searchTestRunner extends Setup {
    SearchPage searchPage;
    @Test
    public void findProducts() throws InterruptedException {
        driver.get("https://www.ajkerdeal.com/");
        searchPage = new SearchPage(driver);
        searchPage.findProducts();
    }
}
