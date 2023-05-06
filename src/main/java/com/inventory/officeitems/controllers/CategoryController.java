package com.inventory.officeitems.controllers;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.officeitems.product.Product;
import com.inventory.officeitems.repository.CategoryRepository;

@RestController
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    
    @GetMapping(value = "/products/{category}/{sub_category}")
    public List<Product> getProductByCategory(@PathVariable(value="category") String category,@PathVariable(value="sub_category") String sub_category)
    {

        List<Product> categoryList = categoryRepository.findByCategory(category);
        List<Product> sub_categoryList = categoryList.stream().filter(p->(p!=null&&p.getSub_Category().equals(sub_category))).collect(Collectors.toList());
        return sub_categoryList;
    }
}