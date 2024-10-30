package com.example.demo.services;
import com.example.demo.Entity.Orders;
import com.example.demo.Repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
@Autowired
    private  OrderRepository orderRepository;

    // public OrderService(OrderRepository orderRepository) {
    //     this.orderRepository = orderRepository;
    // }

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Orders getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // public Orders saveOrder(Orders order) {
    //     return orderRepository.save(order);
    // }

    // public void deleteOrder(Long id) {
    //     orderRepository.deleteById(id);
    // }
}
