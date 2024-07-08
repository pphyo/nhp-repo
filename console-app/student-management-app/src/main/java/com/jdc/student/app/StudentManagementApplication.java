package com.jdc.student.app;

import com.jdc.core.ConsoleApplication;
import com.jdc.student.app.feature.AddStudentFeature;
import com.jdc.student.app.feature.ChangeLanguageFeature;
import com.jdc.student.app.feature.DeleteStudentFeature;
import com.jdc.student.app.feature.EditStudentFeature;
import com.jdc.student.app.feature.FindAllFeature;
import com.jdc.student.app.feature.FindByIdFeature;

public class StudentManagementApplication {
	
	private static ConsoleApplication application;
	
	public static void main(String[] args) {
		
		var application = new ConsoleApplication(
				"Student Management App",
				new AddStudentFeature(),
				new EditStudentFeature(),
				new FindByIdFeature(),
				new FindAllFeature(),
				new DeleteStudentFeature(),
				new ChangeLanguageFeature()
			);
		
		StudentManagementApplication.application = application;
		application.launch();
	}
	
	public static ConsoleApplication getApplication() {
		return application;
	}
		
}
