package com.ecom.AmShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage()
    {
        return "homePage";
    }

    @GetMapping("/login")
    public String login()
    {
        return "loginPage";
    }

    @PostMapping("/authenticate")
    public String authenticate()
    {
        return "hahaha";
    }

    @GetMapping("/list")
    public String productList()
    {
        return "productListPage";
    }

}
