package com.ecom.AmShop.Service;

import com.ecom.AmShop.Model.Images;
import com.ecom.AmShop.Model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct(Product product);
    List<Images> getBLOBfromFile(List<MultipartFile> fileList, Product product);
    Product getProductById(int id);
}
