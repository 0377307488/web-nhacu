package com.example.api_java6.Service;

import java.util.List;

public interface CRUDService<T, ID> {
	default List<T> findAll(){
		return List.of();
	}
	default T findById(ID id){
		return null;
	}
	default T create(T entity){
		return entity;
	}
	default void update(T entity){
	}
	default void deleteById(ID id){
	}
	default boolean existsById(ID id){
		return false;
	}
}
