package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage {
    private WebDriver driver;
    private By searchBar = By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]");
    private By searchBtn = By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button");

    public StorePage(WebDriver driver){
        this.driver = driver;
    }

    public void fillSearchBar (String product){
        driver.findElement(searchBar).sendKeys(product);
    }
    public void clickSearch(){
        driver.findElement(searchBtn).click();
    }

}
