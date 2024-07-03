package com.jdc.generic;

public class GenericBox<T> {
	
	private T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return data;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + data.getClass().getSimpleName());
		System.out.println("U: " + u.getClass().getSimpleName());
	}

}
