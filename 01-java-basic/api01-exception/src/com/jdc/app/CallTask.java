package com.jdc.app;

public class CallTask {
	
	public static void one() {
		System.out.println("one starts.");
		two();
		System.out.println("one ends.");
	}
	
	public static void two() {
		System.out.println("two starts.");
		three();
		System.out.println("two ends.");		
	}
	
	public static void three() {
		System.out.println("three starts.");
		four();
		System.out.println("three ends.");
	}

	public static void four() {
		System.out.println("four starts");
		System.out.println(3 / 0);
		System.out.println("four ends");
	}
}
