package com.jdc.lambda;

public class Reference {

	public Reference() {}
	
	public Reference(String message) {
		System.out.println(message);
	}
	
	public static String getData() {
		return "This is static data!";
	}
	
	public double takeaway(int a, int b) {
		return a - b;
	}
	
}
