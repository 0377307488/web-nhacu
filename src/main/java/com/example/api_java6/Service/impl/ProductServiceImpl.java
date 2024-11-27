package com.example.api_java6.Service.impl;
import com.example.api_java6.Dao.ProductDAO;
import com.example.api_java6.Entity.Product;
import com.example.api_java6.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO dao;

	@Override
	public List<Product> findAll() {
		return dao.findAll();
	}
	
	@Override
	public Page<Product> findAll(Pageable pageable) {
		return dao.findAll(pageable);
	}

	@Override
	public Product findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Product create(Product entity) {
		return dao.save(entity);
	}

	@Override
	public void update(Product entity) {
		dao.save(entity);
	}

	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return dao.existsById(id);
	}

	@Override
	public List<Product>findByCategoryId(String id){return dao.findByCategoryId(id);}

	@Override
	public List<Product>findByBrand(String brand){return dao.findByBrand(brand);}
}
