package com.ecom.AmShop.Service;

import com.ecom.AmShop.Model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();
    Order getOrderById(int id);
}
