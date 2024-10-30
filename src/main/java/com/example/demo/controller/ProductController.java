// package com.example.demo.controller;
// //import com.example.demo.Entity.Orders;
// import com.example.demo.Entity.Products;
// //import com.example.demo.Entity.Product;
// import com.example.demo.services.ProductService;

// import org.springframework.beans.factory.annotation.Autowired;
// //import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// //import java.util.HashMap;
// import java.util.List;
// //import java.util.Map;
// @RestController
// @RequestMapping("/products")
// public class ProductController {
//     @Autowired
//     private ProductService product;
//     @CrossOrigin(origins = "http://localhost:3000")
//     @GetMapping("/data")
//     public ResponseEntity<List<Products>> getProducts() {
//       List<Products> response = product.getAllProducts();
//       return ResponseEntity.ok(response);
//     }
//     // public ResponseEntity<List<Orders>> getAllProducts() {
//     //     List<Orders> response = product.getAllOrders();
//     //   //  Map<String, Object> response = new HashMap<>();
//     //   //  response.put("products", products);
//         // return ResponseEntity.ok(response);
//     }
