package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By loginUsername = By.id("username");
    private  By loginPassword = By.id("password");
    private By loginBtn = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillUsername(String username){
        driver.findElement(loginUsername).sendKeys(username);
    }

    public void fillPassword(String password){
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickLogin (){
        driver.findElement(loginBtn).click();
    }
}
