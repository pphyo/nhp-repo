package com.pphyo.composite;

public class BaseDepartment {
	
	private int id;
	private String name;

	public BaseDepartment(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void printDepartmentName() {
		System.out.println("%-4s: %s".formatted(id, name));
	}

}
