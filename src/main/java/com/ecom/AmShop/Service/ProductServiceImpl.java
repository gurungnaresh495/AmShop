package com.ecom.AmShop.Service;

import com.ecom.AmShop.DAO.ProductRepo;
import com.ecom.AmShop.Model.Images;
import com.ecom.AmShop.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo  productRepo;



    @Override
    public List<Images> getBLOBfromFile(List<MultipartFile> fileList, Product product)
    {
        List<Images> listOfImages = new ArrayList<Images>();
        for ( MultipartFile temp : fileList) {
            Images img = new Images();
            img.setProduct(product);
            String fileName = StringUtils.cleanPath(temp.getOriginalFilename());
            try {
                img.setActual_image(Base64.getEncoder().encodeToString(temp.getBytes()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            listOfImages.add(img);
        }
        return listOfImages;
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepo.save(product);
    }
}
