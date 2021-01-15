package com.ecom.AmShop.DAO;

import com.ecom.AmShop.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
