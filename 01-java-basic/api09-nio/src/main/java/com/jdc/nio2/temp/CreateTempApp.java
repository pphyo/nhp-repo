package com.jdc.nio2.temp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateTempApp {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			var root = Path.of(System.getProperty("user.home"), "Desktop/nhp/nio/temp");
			
			if(!Files.exists(root))
				Files.createDirectory(root);

			while(true) {
				System.out.print("Enter input: ");
				var input = br.readLine();
				
				if(input.toLowerCase().equals("bye")) {
					System.exit(1);
				}
				
				var path = Files.createTempFile(root, input, ".tmp");
				
				path.toFile().deleteOnExit();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
