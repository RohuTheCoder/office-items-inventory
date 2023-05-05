package com.inventory.officeitems.controllers;

import com.inventory.officeitems.product.Product;
import com.inventory.officeitems.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@EnableJpaRepositories
public class ProductController{
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/products/{id}")
    public Optional<Product> getProductById(@PathVariable(value="id")  int id){
        return Optional.ofNullable(productRepository.findById(id));

    }

    @PostMapping("/createProduct")
    public String createProduct(@RequestBody(required = false) Product product) {
        System.out.println("create product");
        try {
            productRepository.save(product);
            return "Created PRODUCT success";
        }
        catch(Exception ex)
        {
            return ex.toString();
        }
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(value="id") int id){
       try {
           productRepository.deleteById(id);
           return "Deleted PRODUCT success";
       }
       catch(Exception ex)
       {
           return ex.toString();
       }
    }


}
