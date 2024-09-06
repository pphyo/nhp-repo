package com.pphyo.j21.vararg;

public class VarargApp {

	public static void main(String[] args) {
		
		sumOfStrings(new String[] {});
		
		sumOfInts("", 1.2f, 2.3f, 4.5f);
		
	}
	
	static void sumOfStrings(String[] strings) {
		System.out.println(strings);
	}
	
	// 0 or more
	static void sumOfInts(String name, Float... ints) {
		System.out.println(ints);
	}
	
}
