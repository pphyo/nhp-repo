package com.jdc.io.stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamApp {
	
	public static void main(String[] args) {
		copy();
	}
	
	static void copy() {
		try(var fr = new FileReader(new File("cs/aws.png"));
				var fw = new FileWriter(new File("cs/aws-clone.png"))) {
			
			int data;
			
			var start = System.currentTimeMillis();
			
			while((data = fr.read()) != -1) {
				fw.write(data);
			}
			
			var end = System.currentTimeMillis();
			
			System.out.println("Time Elapsed: " + (end - start));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
