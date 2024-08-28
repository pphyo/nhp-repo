package com.jdc.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamApp {
	
	public static void main(String[] args) {
		execute();
	}
	
	static void execute() {
		try(var br = new BufferedReader(new FileReader("bs/input.txt"));
				var bw = new BufferedWriter(new FileWriter("bs/output.txt"))) {
			
			String data;
			var start = System.currentTimeMillis();
			while((data = br.readLine()) != null) {
				System.out.println(data);
				bw.write(data);
			}
			
			var end = System.currentTimeMillis();
			
			System.out.println("Time Elapsed: " + (end - start));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
