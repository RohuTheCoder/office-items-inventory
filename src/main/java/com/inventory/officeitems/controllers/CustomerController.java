package com.inventory.officeitems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.inventory.officeitems.product.Product;
import com.inventory.officeitems.repository.CustomerRepository;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "/customer/{customerid}")
    public List<Product> getProductsByCustomerId(@PathVariable(value="customerid") String customerid){
        
        return customerRepository.findByCustomerid(customerid);
    }
}
