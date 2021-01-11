package com.ecom.AmShop.DAO;

import com.ecom.AmShop.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
