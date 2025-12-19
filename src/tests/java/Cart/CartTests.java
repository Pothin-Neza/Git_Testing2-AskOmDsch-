package Cart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.OrderConfirmationPage;

public class CartTests extends BaseTests {

    @Test
    public void cartShouldNotBeEmptyAfterAddingProduct() {

        HomePage homePage = new HomePage(driver);
        homePage.clickAddToCart();
        homePage.hoverCartIcon();

        CartPage cartpage = new CartPage(driver);
        cartpage.clickProceedCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillFirstName("Pothin");
        checkout.fillLastName("Neza");
        checkout.fillCountry();
        checkout.fillStreet("KG27");
        checkout.fillState("Kigali");
        checkout.fillPostCode("00000");
        checkout.fillCity("Kigali");
        checkout.fillEmail("pothin@gmail.com");
        checkout.clickPlaceOrder();

        checkout.clickPlaceOrder();

        OrderConfirmationPage orderConfirmation = new OrderConfirmationPage(driver);
        String actualConfirmationMessage = orderConfirmation.getConfirmationMessage();

        String expectedMessage = "Thank you. Your order has been received.";
        Assert.assertEquals(actualConfirmationMessage, expectedMessage,
                "The order confirmation message did not match the expected value.");

    }
}
