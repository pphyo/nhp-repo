package com.jdc.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteStreamApp {

	public static void main(String[] args) {
		withReadAndWrite(new File("fis/input.txt"), new File("fis/output.txt"));
//		copyImage();
	}
	
	static void copyImage() {
		try(var in = new FileInputStream(new File("fis/duke.png"));
				var out = new FileOutputStream(new File("fis/duke-clone.png"))) {
			
			int data;
			
			while((data = in.read()) != -1) {
				out.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void withReadAndWrite(File source, File target) {
		
		try(var in = new FileInputStream(source);
				var out = new FileOutputStream(target)) {
			
//			int data;
			
			var start = System.currentTimeMillis();
			
//			while((data = in.read()) != -1) {
//				out.write(data);
//			}
			
			long transferedByte = in.transferTo(out);
			
			System.out.println(transferedByte);
			var end = System.currentTimeMillis();
			
			System.out.println(end - start);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	static void writeTo(File file) {
		String dataForWrite = """
				Signal inputs with input()
				Reading input() values
				Optional inputs
				Making an input to be required
				Setting a custom public name: alias
				Value transformation: transform
				Deriving values from input signals
				No more need for the OnChanges lifecycle hook
				What is output()?
				Alias on output()
				output() RxJs interoperability using outputFromObservable()
				output() RxJs interoperability using outputToObservable()
				What is model()?
				Two-Way Binding to a Signal Value
				When to use model()?
				Two-Way Binding to a Non-Signal Value
				Responding to model changes
				Using alias on model()
				Making model() to be required
				Summary""";
		
		try(var fos = new FileOutputStream(file)) {
			
			for(byte b : dataForWrite.getBytes(StandardCharsets.UTF_8)) {
				fos.write(b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void readFrom(File file) {
		try(var fis = new FileInputStream(file)) {
			
//			int[] data = 0;
//			
//			while(data != -1) {
//				data = fis.readAllBytes()
//				
////				StreamUtil.check(data);
//				
//				System.out.print((char)data);
//			}
			
			byte[] remaingBytes = fis.readAllBytes();
			
			for(byte b : remaingBytes) {
				System.out.print((char) b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
