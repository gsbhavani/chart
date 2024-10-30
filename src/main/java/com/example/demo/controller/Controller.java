package com.example.demo.controller;
import com.example.demo.Entity.Customers;
import com.example.demo.Entity.Orders;
import com.example.demo.Entity.Products;
// import com.example.demo.Entity.Orders;
// import com.example.demo.Entity.Products;
// import com.example.demo.Entity.Customers;
import com.example.demo.services.CustomerService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private CustomerService customer;
    @GetMapping("/customers")
    public ResponseEntity<List<Customers>> getAllCustomers() {
      List<Customers> response = customer.getAllCustomers();
      return ResponseEntity.ok(response);
    }
    @Autowired
    private OrderService order;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> getAllOrders() {
      List<Orders> response = order.getAllOrders();
      return ResponseEntity.ok(response);
    }
    @Autowired
    private ProductService product;
    @GetMapping("/products")
    public ResponseEntity<List<Products>> getAllProducts() {
      List<Products> response = product.getAllProducts();
      return ResponseEntity.ok(response);
    }
}