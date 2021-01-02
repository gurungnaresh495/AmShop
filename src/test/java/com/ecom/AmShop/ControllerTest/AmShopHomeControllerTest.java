package com.ecom.AmShop.ControllerTest;

import com.ecom.AmShop.AmShopApplication;
import com.ecom.AmShop.Controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AmShopApplication.class)
public class AmShopHomeControllerTest {

    @Autowired
    private HomeController homeController = new HomeController();

    @Test
    public void loginPageTest()
    {
        assertEquals("loginPage", homeController.login());
    }

    @Test
    public void homePageTest()
    {
        assertEquals("homePage", homeController.homePage());
    }

//    @Test
//    public void signUpPageTest()
//    {
//        assertEquals("signupPage", homeController.signup());
//    }
}
