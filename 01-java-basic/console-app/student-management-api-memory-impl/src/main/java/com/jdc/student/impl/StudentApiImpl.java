package com.jdc.student.impl;

import java.util.ArrayList;

import com.jdc.student.api.StudentApi;
import com.jdc.student.api.domain.Student;
import com.jdc.student.impl.util.ExceptionMessageHandler;

public class StudentApiImpl extends BaseApiImpl<Student> implements StudentApi {
	
	private static StudentApi INSTANCE;
	
	private StudentApiImpl() {
		super(new ArrayList<Student>());
	}

	public static StudentApi getInstance() {
		if(INSTANCE == null)
			INSTANCE = new StudentApiImpl();
		
		return INSTANCE;
	}

	@Override
	public void update(int id, Student t) {
		checkId(id);
		
		var index = findIndex(id);
		
		database.set(index, t);
	}

	@Override
	public Student findById(int id) {
		checkId(id);
		
		var index = findIndex(id);
		
		return this.database.get(index);
	}

	@Override
	public void delete(int id) {
		checkId(id);
		database.remove(findIndex(id));
	}
	
	@Override
	protected Student generateIdValue(Student stu) {
		int id = 0;
		for(var student : findAll()) {
			if(id < student.getId())
				id = student.getId();
		}
		stu.setId(id == 0 ? 1 : ++id);
		return stu;
	}
	
	private int findIndex(int id) {
		var result = -1;
		for(var student : database) {
			if(student.getId() == id)
				result = database.indexOf(student);
		}
		
		if(result < 0)
			ExceptionMessageHandler.checkId(id, "Student");
		return result;
	}
	
}
