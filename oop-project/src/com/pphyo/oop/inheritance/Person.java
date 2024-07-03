package com.pphyo.oop.inheritance;

// Person is a UniversalPerson
public class Person extends UniversalPerson {
	
	public int age = 20;
		
	static {
		System.out.println("Person static block...");
	}
	
	{
		System.out.println("Person instance block...");
	}
	
	@Override
	public void eat() {
		System.out.println("Person eat..." + age);
	}
	
	public void work() {
		System.out.println("Person work...");
	}
	
}
