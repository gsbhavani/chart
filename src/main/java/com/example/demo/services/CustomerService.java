package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Customers;
import com.example.demo.Repository.CustomerRepository;
import java.util.List;
@Service
public class CustomerService {
     @Autowired
    private CustomerRepository customerRepository;
    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }
}
