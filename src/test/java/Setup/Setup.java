package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}
