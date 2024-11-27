package com.example.api_java6.Service;



import com.example.api_java6.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService extends CRUDService<Product, Integer>{
	Page<Product> findAll(Pageable pageable);
	List<Product> findByCategoryId(String id);
	List<Product> findByBrand(String brand);
}
