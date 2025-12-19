package Search;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.StorePage;

public class SearchTests extends BaseTests {
    @Test

    public void SearchProduct(){
        HomePage homePage1 = new HomePage(driver);
        homePage1.clickStore();

        StorePage searchproduct = new StorePage(driver);
        searchproduct.fillSearchBar("bracelet");
        searchproduct.clickSearch();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(
                currentUrl.contains("bracelet"),
                "You're on the wrong page"
        );
    }
}
