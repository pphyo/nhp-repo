package com.pphyo.oop.overload;

public class Employee {

	private String name;
	private double salary;
	private String phone;
	private boolean permanent;

	public Employee() {
		super();
		System.out.println("No arg...");
	}
	
	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("1 arg...");
	}
	
	public Employee(String name, double salary) {
		this(name);
		this.salary = salary;
		System.out.println("2 args...");
	}
	
	public Employee(String name, double salary, String phone) {
		this(name, salary);
		this.phone = phone;
		System.out.println("3 args");
	}
	
	public Employee(String name, double salary, String phone, boolean permanent) {
		this(name, salary, phone);
		this.permanent = permanent;
		System.out.println("4 args");
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getPhone() {
		return phone;
	}

	public boolean isPermanent() {
		return permanent;
	}

}
