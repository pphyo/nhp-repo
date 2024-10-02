package com.pphyo.oop.encapsulation;

public class Customer {

	// encapsulation
	private String name;
	private int age;
	private String phone;
	protected String address;
	private boolean deleted;

	public Customer(String name) {
		System.out.println(name);
	}

	// getter or accessor
	public int getAge() {
		return age;
	}

	// setter or mutator
	public void setAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("Age must be greater than zero.");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
