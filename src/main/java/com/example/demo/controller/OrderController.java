// package com.example.demo.controller;
// import com.example.demo.Entity.Orders;
// import com.example.demo.services.OrderService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// //import java.util.HashMap;
// //import java.util.Map;
// @RestController
// @RequestMapping("/orders")
// public class OrderController {
//    // @SuppressWarnings("unused")
//     @Autowired
//     private OrderService order;
//     @CrossOrigin(origins = "http://localhost:3000")
//     @GetMapping("/data")
//     public ResponseEntity<List<Orders>> getOrders() {
//         List<Orders> response = order.getAllOrders();
       
//         return ResponseEntity.ok(response);
//     }
// }