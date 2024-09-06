package com.jdc.generic.inherit;

public class BoxSubWithGeneric<T> extends BoxSuper {
	
	private T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return data;
	}

}
