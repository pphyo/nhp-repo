package com.pphyo.spring;

public class EmployeeService {
	
	public EmployeeService() {
		System.out.println("Employee Service Default Constructor");
	}
	
	public EmployeeService(String data) {
		System.out.println(data);
		System.out.println("Employee Service Constructor with int param");
	}
	
	public String greet() {
		return "Hello from EmployeeService";
	}

}
