package com.ecom.AmShop.DAO;

import com.ecom.AmShop.Model.Images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Images, Integer> {
}
