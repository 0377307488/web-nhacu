package com.example.api_java6.Dao;
import com.example.api_java6.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Integer> {
    List<Product> findByCategoryId(String id);
    List<Product> findByBrand(String brand);

}
