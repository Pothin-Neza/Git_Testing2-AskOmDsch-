package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessoriesPage {
    private WebDriver driver;
    private By category = By.id("product_cat");

      public AccessoriesPage(WebDriver driver){
        this.driver = driver;
      }

      public void browseCategory (){
          Select Category = new Select(driver.findElement(category));
          Category.selectByVisibleText("Men’s Jeans  (4)");
      }
}
