package com.example.api_java6.RestController;

import com.example.api_java6.Entity.Product;
import com.example.api_java6.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/api/product")
    public List<Product> getAllCategoryDetail() {
        return productService.findAll();
    }

//    @GetMapping("/api/product/{id}")
//    public Product getCategoryById(@PathVariable("id") Integer id) {
//        return productService.findById(id);
//    }
    @GetMapping("/api/product/{brand}")
    public List<Product> findBybrand(@PathVariable("brand") String brand) {
        return productService.findByBrand(brand);
    }
    @PostMapping("/api/product")
    public Product create(@RequestBody Product category) {
        return productService.create(category);
    }

    @PutMapping("/api/product/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody Product product) {
        if (productService.findById(id) != null) {
            productService.update(product);
        }
    }
    @DeleteMapping("/api/product/{id}")
    public void delete(@PathVariable("id") Integer id) {
        if (productService.findById(id) != null) {
            productService.deleteById(id);
        }
    }
}