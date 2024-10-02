package com.jdc.student.api;

import com.jdc.student.api.domain.Student;

public interface StudentApi extends BaseApi<Student> {
	
	void delete(int id);

}
