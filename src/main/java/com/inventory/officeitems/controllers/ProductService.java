package com.inventory.officeitems.controllers;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
@Service
public class ProductService  implements IProductService    {

    @Override
    public List<Product> findAll() {
        //creating an object of ArrayList
        ArrayList<Product> products = new ArrayList<Product>();
//adding products to the List
        products.add(new Product(1,"CA-2016-152156","11/8/2016","11/11/2016","Second Class","CG-12520","Claire Gut",
                "Consumer","United States","Henderson","Kentucky", 42420.0,"South","FUR-BO-10001798","Furniture",
                "Bookcases","Bush Somerset Collection Bookcase", 296.96F,2, (float) 0, 41.9136F));
        //returns a list of product
        return products;
    }

}
