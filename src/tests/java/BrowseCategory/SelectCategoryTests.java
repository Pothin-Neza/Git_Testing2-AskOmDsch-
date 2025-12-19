package BrowseCategory;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccessoriesPage;
import pages.HomePage;

public class SelectCategoryTests extends BaseTests {

    @Test
    public void Category(){
        HomePage browse = new HomePage(driver);
        browse.clickAccessories();

        AccessoriesPage chooseCategory = new AccessoriesPage(driver);
        chooseCategory.browseCategory();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("mens-jeans"), "BrowseCategory ain't working!");
    }
}
