package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MenPage {
    private WebDriver driver;
    private By minSet = By.xpath("//*[@id=\"woocommerce_price_filter-3\"]/form/div/div[1]/span[1]");
    private By maxSet = By.xpath("//*[@id=\"woocommerce_price_filter-3\"]/form/div/div[1]/span[2]");
    private By filterBtn = By.xpath(" //*[@id=\"woocommerce_price_filter-3\"]/form/div/div[2]/button");

    public MenPage(WebDriver driver){
        this.driver = driver;
    }

    public void setRange(){
        Actions range = new Actions(driver);
        range.dragAndDropBy (driver.findElement(minSet), 20, 0).perform();
        range.dragAndDropBy(driver.findElement(maxSet), -20, 0 ).perform();
    }

    public void clickFilter(){
        driver.findElement(filterBtn).click();
    }
}
