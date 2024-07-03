package com.jdc.student.impl;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import com.jdc.student.api.BaseApi;
import com.jdc.student.impl.util.SMException;

public abstract class BaseApiImpl<T> implements BaseApi<T> {
	
	protected List<T> database;
	
	public BaseApiImpl(List<T> list) {
		Objects.requireNonNull(list);
		this.database = list;
	}

	@Override
	public void add(T t) {
		if(null == t) {
			throw new SMException("Null object can't be accepted!");
		}
		var result = generateIdValue(t);
		database.add(result);
	}

	@Override
	public List<T> findAll() {
		return Collections.unmodifiableList(database);
	}
	
	protected abstract T generateIdValue(T t);
	
	protected void checkId(int id) {
		if(id < 0) {
			throw new SMException("Please enter valid ID!");
		}
	}
	
}
