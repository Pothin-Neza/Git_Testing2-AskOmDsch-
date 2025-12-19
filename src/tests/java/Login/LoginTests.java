package Login;

import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void login (){
        var Login = homePage.clickAccountLogin();
        Login.fillUsername("Neza");
        Login.fillPassword("Crigabe70##");
        Login.clickLogin();
    }
}
