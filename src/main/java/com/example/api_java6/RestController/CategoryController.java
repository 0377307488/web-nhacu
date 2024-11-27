package com.example.api_java6.RestController;


import com.example.api_java6.Entity.Category;
import com.example.api_java6.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
   @Autowired
   CategoryService categoryService;

   @GetMapping("/api/category")
    public List<Category> getAllCategories() {
       return categoryService.findAll();
   }
   @GetMapping("/api/category/{id}")
   public Category getCategoryById(@PathVariable("id") String id) {
      return categoryService.findById(id);
   }
   @PostMapping("/api/category")
   public Category create(@RequestBody Category category) {
      return categoryService.create(category);
   }
   @PutMapping("/api/category/{id}")
   public void update(@PathVariable("id") String id, @RequestBody Category category) {
      if (categoryService.findById(id) != null) {
         categoryService.update(category);
      }
   }
   @DeleteMapping("/api/category/{id}")
   public void delete(@PathVariable("id") String id) {
      if (categoryService.findById(id) != null) {
         categoryService.deleteById(id);
      }
   }
}
