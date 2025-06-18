package com.pluralsight.northwindtraders.api.controller;

import com.pluralsight.northwindtraders.api.model.Categories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private final List<Categories> categories = Arrays.asList(
            new Categories(101, "Electronics"),
            new Categories(102, "Mobile Devices"),
            new Categories(17, "Gaming")
    );
    @GetMapping
    public List<Categories> getAllProducts() {
        return categories;
    }

    @GetMapping("/{id}")
    public Categories getCategoryById(@PathVariable int id) {
        for (Categories c : categories) {
            if (c.getCategoryId() == id) {
                return c;
            }
        }
        return null; // You can return ResponseEntity.notFound() if you want better error handling
    }
}