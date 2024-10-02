package com.pphyo.fm.v1.factory;

public class StudentFactory {
	
	public static Student ofName(String name) {
		var student = new Student();
		student.setName(name);
		return student;
	}
	
	public static Student ofPhone(String phone) {
		var student =  new Student();
		student.setPhone(phone);
		return student;
	}

}
