package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://askomdch.com/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
}