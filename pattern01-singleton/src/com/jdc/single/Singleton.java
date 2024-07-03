package com.jdc.single;

public class Singleton {
	
	private static Singleton INSTANCE;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

}
