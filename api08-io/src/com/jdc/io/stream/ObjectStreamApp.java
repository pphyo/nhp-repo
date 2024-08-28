package com.jdc.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class ObjectStreamApp {
	
	public static void main(String[] args) {
		readWithExternal();
	}
	
	static void readWithExternal() {
		var food = new Category();
		
		try(var in = new ObjectInputStream(new FileInputStream("os/category.ser"))) {
			food.readExternal(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(food);
	}
	
	static void writeWithExternal() {
		var food = new Category();
		food.setId(1);
		food.setName("Food");
		food.setCreated(LocalDateTime.now());
		food.setDescription("Food for human");
		
		try(var out = new ObjectOutputStream(new FileOutputStream("os/category.ser"))) {
			food.writeExternal(out);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static Category readCategory() {
		try(var in = new ObjectInputStream(new FileInputStream("os/category.ser"))) {
			return (Category) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	static String writeCategory(Category category) {
		try(var out = new ObjectOutputStream(new FileOutputStream("os/category.ser"))) {
			
			out.writeObject(category);
			
			return "Object is writed";
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
