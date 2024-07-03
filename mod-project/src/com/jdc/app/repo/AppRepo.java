package com.jdc.app.repo;

import com.jdc.app.domain.Student;

public interface AppRepo {
	void insert(Student t);
	Student findById(int id);
}
