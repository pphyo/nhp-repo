package com.jdc.student.app;

import com.jdc.core.ConsoleApplication;
import com.jdc.student.app.feature.AddStudentFeature;
import com.jdc.student.app.feature.FindAllFeature;

public class StudentManagementApplication {
	
	public static void main(String[] args) {
		
		var application = new ConsoleApplication(
					"Student Management App",
					new AddStudentFeature(),
					new FindAllFeature()
				);
		
		application.launch();
	}

}
