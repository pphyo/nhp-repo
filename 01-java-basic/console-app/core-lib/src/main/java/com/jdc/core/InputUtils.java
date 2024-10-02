package com.jdc.core;

import java.util.Scanner;

public class InputUtils {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static int readInt(String message) {
		return Integer.parseInt(readString(message));
	}
	
	public static String readString(String message) {
		System.out.print(message);
		return scanner.nextLine();
	}
	
	public static Scanner getScanner() {
		return scanner;
	}

}
