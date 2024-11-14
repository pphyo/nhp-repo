package com.pphyo.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DecoratorApplication {
	
	public static void main(String[] args) {
		
		var decorator = new DatasourceDecorator(new EncryptionDecorator(new CompressionDecorator(new EncryptionDecorator(new FileDatasource()))));
		
		decorator.write("Information data");
		
		System.out.println(decorator.read());
		
		try(var obj = new BufferedReader(new InputStreamReader(new FileInputStream(new File(""))))) {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
