package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public RegisterPage clickAccount (){
        click("//*[@id=\"menu-item-1237\"]/a");
        return new RegisterPage(driver);
    }
    public LoginPage clickAccountLogin(){
        click("//*[@id=\"menu-item-1237\"]/a");
        return new LoginPage(driver);
    }

    public void click(String path){
        driver.findElement(By.xpath(path)).click();
    }

}
