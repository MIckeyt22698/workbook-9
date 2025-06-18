package com.pluralsight.northwindtraders.api.controller;

import com.pluralsight.northwindtraders.api.model.Products;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final List<Products> products = Arrays.asList(
            new Products(1, "Laptop", 101, 799.99),
            new Products(2, "Phone", 102, 499.99),
            new Products(3, "Monitor", 101, 199.99),
            new Products(5, "Keyboard", 101, 49.99)
    );

    @GetMapping
    public List<Products> getAllProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable int id) {
        for (Products p : products) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        return null; // You could also throw an exception or return a ResponseEntity
    }
}