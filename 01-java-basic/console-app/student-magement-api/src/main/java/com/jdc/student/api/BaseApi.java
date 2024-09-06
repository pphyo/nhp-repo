package com.jdc.student.api;

import java.util.List;

/**
 * Base operation of CRUD
 * 
 * @param <T>
 */
public interface BaseApi<T> {
	
	void add(T t);
	
	void update(int id, T t);
	
	List<T> findAll();
	
	T findById(int id);

}
