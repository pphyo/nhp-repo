package com.jdc.app.ex;

import java.util.Objects;

public class StudentDatabase {

	public void insert(Student student) {
		if(Objects.isNull(student)) {
			throw new StudentException("Student object can't be null.");
		}
		// insert student into database
		System.out.println(student);
	}
	
}
