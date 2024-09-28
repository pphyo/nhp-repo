package com.pphyo.fm.v1.factory;

public class StudentFactory {
	
	public static Student withName(String name) {
		var student = new Student();
		student.setName(name);
		return student;
	}
	
	public static Student withPhone(String phone) {
		var student =  new Student();
		student.setPhone(phone);
		return student;
	}

}
