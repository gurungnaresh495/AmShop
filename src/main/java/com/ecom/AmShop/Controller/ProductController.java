package com.ecom.AmShop.Controller;

import com.ecom.AmShop.Model.Images;
import com.ecom.AmShop.Model.Product;
import com.ecom.AmShop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/randomItems")
    public List<Product> getRandomProducts()
    {
        return null;
    }

    @GetMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Product> getAllProducts()
    {
        return this.productService.getAllProducts();
    }



}
