package com.ecom.AmShop.Controller;

import com.ecom.AmShop.Model.Order;
import com.ecom.AmShop.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/allOrders")
    public List<Order> getAllOrders()
    {
        return orderService.getOrders();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable("id") int id )
    {
        return orderService.getOrderById(id);
    }
}
