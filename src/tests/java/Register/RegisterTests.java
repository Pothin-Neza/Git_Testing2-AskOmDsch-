package Register;

import base.BaseTests;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTests {
    @Test

    public void registerTest (){
        var register = homePage.clickAccount();
        register.setUsername("Neza");
        register.setEmail("Pothin@gmail.com");
        register.setPassword("Crigabe70##");
        register.clickRegister();
    }
}
