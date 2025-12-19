package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    private WebDriver driver;
    private By proceedCheck = By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutPage clickProceedCheckout(){
        driver.findElement(proceedCheck).click();
        return new CheckoutPage(driver);
    }

}
