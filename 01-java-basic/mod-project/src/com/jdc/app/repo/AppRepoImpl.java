package com.jdc.app.repo;

import com.jdc.app.domain.Student;

public class AppRepoImpl implements AppRepo {

	@Override
	public void insert(Student t) {
		System.out.println("inserting student");		
	}

	@Override
	public Student findById(int id) {
		System.out.println("find with id");
		return null;
	}

}
