package com.inventory.officeitems.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.officeitems.product.Product;

@Repository
public interface CustomerRepository extends JpaRepository<Product,String> {
    List<Product> findByCustomerid(String customer_id);
}
