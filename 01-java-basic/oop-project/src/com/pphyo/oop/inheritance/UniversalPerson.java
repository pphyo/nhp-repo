package com.pphyo.oop.inheritance;

public class UniversalPerson {
	
	static {
		System.out.println("UniversalPerson static block...");
	}
	
	{
		System.out.println("UniversalPerson instance block...");
	}

	public static int counter = 1;
	private int id;
	private String name;
	String gender;
	public int age = 10;

	public UniversalPerson() {
		id = counter;
		counter ++;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("UniversalPerson eat..." + age);
	}

	public void sleep() {
		System.out.println("UniversalPerson sleep...");
	}
	
	public static void countUp() {
		System.out.println("UniversalPerson countUp...");
	}

}
