package com.jdc.core;

public class StringUtils {

	public static boolean isEmpty(String str) {
		return null == str || str.isBlank();
	}
	
	public static void showMessage(String message) {
		String star = "";
		
		for(int i = 0, l = message.length(); i < l; i ++) {
			star += "*";
		}
		
		System.out.println("**%s**".formatted(star));
		System.out.println("* %s *".formatted(message));
		System.out.println("**%s**".formatted(star));
	}
	
}
