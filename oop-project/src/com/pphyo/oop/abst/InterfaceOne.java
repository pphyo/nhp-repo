package com.pphyo.oop.abst;

public interface InterfaceOne {
	
	void run();
	
	default void doGet() {
		System.out.println("default doGet().");
	}
	
	static void start() {
		System.out.println("static start().");
	}
}
