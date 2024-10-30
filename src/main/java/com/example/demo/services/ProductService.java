package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Orders;
import com.example.demo.Entity.Products;
import com.example.demo.Repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
@Autowired
    private  ProductRepository productRepository;

    // public ProductService(ProductRepository productRepository) {
    //     this.productRepository = productRepository;
    // }

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Orders> getOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrders'");
    }
   
}
