package com.example.demo.Repository;

import com.example.demo.Entity.Products;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
