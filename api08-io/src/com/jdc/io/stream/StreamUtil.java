package com.jdc.io.stream;

public class StreamUtil {
	
	static void check(int data) {
		if(data > 127) {
			throw new IllegalArgumentException("Read data more than byte!");
		}
	}

}
