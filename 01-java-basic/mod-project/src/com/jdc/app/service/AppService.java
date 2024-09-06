package com.jdc.app.service;

import com.jdc.app.domain.Student;
import com.jdc.app.repo.AppRepo;
import com.jdc.app.repo.AppRepoImpl;

public class AppService {
	
	private AppRepo repo = new AppRepoImpl();
	
	public void insert(Student student) {
		repo.insert(student);
	}

	public Student findById(int id) {
		return repo.findById(id);
	}
}
