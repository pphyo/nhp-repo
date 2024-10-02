package com.jdc.generic.obj_create;

import java.util.logging.Logger;

public class CreateObjectApp {
	
	private static final Logger logger = Logger.getLogger("CreateObjectApp");

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			var newKeyword = new Employee();
			System.out.println("Using new keyword: " + newKeyword);
			
			var newInstance = Employee.class.newInstance();
			System.out.println("Using Class's newInstance: " + newInstance);
			
			var forName = Class.forName("com.jdc.generic.obj_create.CreateObjectApp").newInstance();
			System.out.println("Using Class.forName: " + forName);
			
			var constructor = Employee.class.getConstructor(String.class, double.class).newInstance("Emily Rudd", 123300d);
			System.out.println("Using Class's getContructor: " + constructor);
			System.out.println(constructor.getName());
			System.out.println(constructor.getSalary());
			
			var clone = newKeyword.clone();
			System.out.println("Using clone: " + clone);
			
		} catch (Exception e) {
			logger.warning(e.getMessage());
			e.printStackTrace();
		}
	}

}

class Employee implements Cloneable {
	
	private String name;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, double salary) {
		this(name);
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}