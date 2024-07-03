package com.jdc.single;

public class MainApp {

	public static void main(String[] args) {
		
		var sig1 = Singleton.getInstance();
		var sig2 = Singleton.getInstance();
		
		System.out.println(sig1);
		System.out.println(sig2);
		System.out.println(sig1 == sig2);
		
	}

}
