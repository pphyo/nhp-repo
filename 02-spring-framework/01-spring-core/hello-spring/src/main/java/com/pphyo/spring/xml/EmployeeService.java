package com.pphyo.spring.xml;

public class EmployeeService {
	
	public EmployeeService() {
		System.out.println("Employee Service Default Constructor");
	}
	
	public EmployeeService(String strValue, int intValue) {
		System.out.printf("%s : %d%n", strValue, intValue);
	}
	
	public String greet() {
		return "Hello from EmployeeService";
	}

}
