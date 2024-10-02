package com.jdc.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyDemo {
	
	public void test() {
		try(var ac = new AutoClosableImpl()) {
			
		}
		
		try {
			
		} finally {
			
		}
	}
	
	public void perform() {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter text: ");
			String input = reader.readLine();
			
			if(input.equals("exit")) {
				System.exit(0);
			}
			
			System.out.println(input);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
