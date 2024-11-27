package com.example.api_java6.Service.impl;

import com.example.api_java6.Dao.CategoryDao;
import com.example.api_java6.Entity.Category;
import com.example.api_java6.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDao dao;

	@Override
	public List<Category> findAll() {
		return dao.findAll();
	}

	@Override
	public Category findById(String id) {
		return dao.findById(id).get();
	}

	@Override
	public Category create(Category entity) {
		return dao.save(entity);
	}

	@Override
	public void update(Category entity) {
		dao.save(entity);
	}

	@Override
	public void deleteById(String id) {
		dao.deleteById(id);
	}

	@Override
	public boolean existsById(String id) {
		return dao.existsById(id);
	}


}
