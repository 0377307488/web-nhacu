package com.example.api_java6.Dao;

import com.example.api_java6.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, String> {
}
