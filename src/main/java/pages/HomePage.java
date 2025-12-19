package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    //    private By addToCartBtn = By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[2]/div[2]/a[2]");
//
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPage clickAccount() {
        click("//*[@id=\"menu-item-1237\"]/a");
        return new RegisterPage(driver);
    }

    public LoginPage clickAccountLogin() {
        click("//*[@id=\"menu-item-1237\"]/a");
        return new LoginPage(driver);
    }

    public void clickFindMore (){
        click("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[2]/a");
    }

    public void clickAddToCart(){
        click("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]");
        click("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[4]/div[2]/a[2]");
    }
    public CartPage hoverCartIcon() {
        WebElement cartIcon = driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(cartIcon).perform();
        By viewCartButton = By.xpath("//*[@id=\"ast-site-header-cart\"]/div[2]/div/div/p[2]/a[1]");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(viewCartButton));

        // Click "View Cart"
        driver.findElement(viewCartButton).click();
        return new CartPage(driver);
    }
    public StorePage clickStore(){
        click("//*[@id=\"menu-item-1227\"]/a");
        return new StorePage(driver);
    }
    public AccessoriesPage clickAccessories (){
        click("//*[@id=\"menu-item-1230\"]/a");
        return new AccessoriesPage(driver);
    }
    public MenPage clickMen (){
        click("//*[@id=\"menu-item-1228\"]/a");
        return new MenPage(driver);
    }

    public void click(String path){
        driver.findElement(By.xpath(path)).click();
    }
}
//    public boolean addProductAndVerifyMessagePosition() {
//
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        By viewCartLink = By.partialLinkText("View Cart");
//
//        try {
//            // 4. Wait until the message is visible
//            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartLink));
//
//            // 5. Compare coordinates
//            // In web browsers, Y=0 is at the top. Higher Y value means further DOWN the page.
//            int currentButtonY = message.getLocation().getY();
//            int messageY = message.getLocation().getY();
//            System.out.println("Button Y: " + currentButtonY);
//            System.out.println("Message Y: " + messageY);
//
//            // Verification: Message is below if its Y coordinate is greater than the button's Y
//            return messageY >= currentButtonY;
//
//
//        } catch (Exception e) {
//            return false;
//        }







