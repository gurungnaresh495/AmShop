package com.ecom.AmShop.Controller;

import com.ecom.AmShop.DAO.ImageRepo;
import com.ecom.AmShop.DAO.ProductRepo;
import com.ecom.AmShop.DAO.UserRepo;
import com.ecom.AmShop.Model.Images;
import com.ecom.AmShop.Model.Product;
import com.ecom.AmShop.Model.Users;
import com.ecom.AmShop.Service.ProductService;
import com.ecom.AmShop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public Users getUser(@PathVariable String username)
    {
        return this.userService.findUserByUsername(username);
    }

    @GetMapping("/{username}/getProducts")
    public List<Product> getUserProducts(@PathVariable String username)
    {
        return this.userService.findUserByUsername(username).getProducts();
    }

    @PostMapping("/{username}/saveProduct")
    public void saveProduct(@PathVariable("username") String username,
                            @RequestPart("multipartFiles") List<MultipartFile> multipartFiles,
                            @RequestPart("product") Product product)
    {
        Users user = userService.findUserByUsername(username);
        List<Images> listOfImages = productService.getBLOBfromFile(multipartFiles, product);
        product.setImages(listOfImages);
        product.setUser(user);
        user.setProducts(product);
        userService.saveUser(user);
    }


}
