package com.inventory.officeitems.controllers;

import com.inventory.officeitems.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findById(int id);
    String deleteById(int id);
}
