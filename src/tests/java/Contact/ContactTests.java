package Contact;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ContactTests extends BaseTests {

    @Test
    public void Contact() {
        HomePage homepage = new HomePage(driver);
        homepage.clickFindMore();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(
                currentUrl.contains("contact"),
                "You're on the wrong page"
        );
    }
}
