package Slider;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenPage;

import java.util.List;

public class SliderTests extends BaseTests {

    @Test
    public void SlideRange() {
        HomePage slider = new HomePage(driver);
        slider.clickMen();

        MenPage menPage = new MenPage(driver);

        double minValue = 30.0;
        double maxValue = 140.0;

        menPage.setRange();
        menPage.clickFilter();

        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-type-simple")));

        List<WebElement> products = driver.findElements(By.className("product-type-simple"));

        for (WebElement product : products) {
            String priceText = product.findElement(By.tagName ("bdi")).getText();
            double value = Double.parseDouble(priceText.replaceAll("[^0-9.]", ""));
            Assert.assertTrue(value >= minValue && value <= maxValue,
                    "Product price " + value + " is outside the selected range: " + minValue + "-" + maxValue);
        }
    }

}
