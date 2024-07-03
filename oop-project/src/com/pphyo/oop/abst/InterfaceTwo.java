package com.pphyo.oop.abst;

public interface InterfaceTwo {
	
	void exit();
	
	default void doGet() {
		System.out.println("default doGet().");
	}

}
