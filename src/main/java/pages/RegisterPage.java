package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private By RegName = By.id("reg_username");
    private By RegEmail = By.id("reg_email");
    private By RegPassword = By.id("reg_password");
    private By RegisterButton = By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button");

    public RegisterPage (WebDriver driver){
        this.driver = driver;
    }
    public void setUsername (String name){
        driver.findElement(RegName).sendKeys(name);
    }
    public void setEmail (String email){
        driver.findElement(RegEmail).sendKeys(email);
    }
    public void setPassword (String password){
        driver.findElement(RegPassword).sendKeys(password);
    }

    public void clickRegister(){
        driver.findElement(RegisterButton).click();
    }
}
