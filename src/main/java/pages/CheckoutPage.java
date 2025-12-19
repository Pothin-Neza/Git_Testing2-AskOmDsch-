package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    private WebDriver driver;
    private By firstName = By.id("billing_first_name");
    private By lastName = By.id("billing_last_name");
    private By country = By.id("select2-billing_country-container");
    private By street = By.id("billing_address_1");
    private By city = By.id("billing_city");
    private By state = By.id("billing_state");
    private By email = By.id("billing_email");
    private By postcode = By.id("billing_postcode");
    private By placeOrderBtn = By.id("place_order");
    private By confirmation = By.xpath("//*[@id=\"post-1221\"]/div/div/div/div/div/p[1]");
//    private By Rwanda = By.id("select2-billing_country-result-yzzz-RW");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillFirstName (String first){
        driver.findElement(firstName).sendKeys(first);
    }
    public void fillLastName (String last){
        driver.findElement(lastName).sendKeys(last);
    }
    public void fillCountry() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing_country")));

        Select countrySelect = new Select(driver.findElement(By.id("billing_country")));
        countrySelect.selectByVisibleText("Rwanda");

    }
    public void fillStreet (String StreetAddress){
        driver.findElement(street).sendKeys(StreetAddress);
    }
    public void fillCity (String cityAddress){
        driver.findElement(city).sendKeys(cityAddress);
    }

    public void fillState (String stateAddress){
        driver.findElement(state).sendKeys(stateAddress);
    }
    public void fillPostCode (String code){
        driver.findElement(postcode).sendKeys(code);
    }
    public void fillEmail (String emailAddress){
        driver.findElement(email).sendKeys(emailAddress);
    }
    public void clickPlaceOrder(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
//        driver.findElement(placeOrderBtn).click();
    }

}
