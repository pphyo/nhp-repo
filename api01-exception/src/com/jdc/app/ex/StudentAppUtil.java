package com.jdc.app.ex;

import java.io.BufferedReader;
import java.io.IOException;

public class StudentAppUtil {
	
	public static String getString(BufferedReader reader, String message) throws IOException {
		System.out.print(message);
		return reader.readLine();
	}
	
	public static boolean checkString(String data) {
		return null == data || data.isBlank();
	}

}
