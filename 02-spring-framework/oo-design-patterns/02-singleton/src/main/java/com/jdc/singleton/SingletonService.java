package com.jdc.singleton;

public class SingletonService {
	
	private static SingletonService INSTANCE;
	
	private String data;
	
	private SingletonService(String data) {
		this.data = data;
	}
	
	public static SingletonService getInstance(String data) {
		if(INSTANCE == null)
			INSTANCE = new SingletonService(data);
		return INSTANCE;
	}
	
	public String getData() {
		return data;
	}

}
