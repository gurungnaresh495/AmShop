package com.ecom.AmShop.Service;

import com.ecom.AmShop.DAO.OrderRepo;
import com.ecom.AmShop.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepo.findById(id).get();
    }
}
