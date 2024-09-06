package com.jdc.app.ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.jdc.app.ex.Student.Gender;

import static com.jdc.app.ex.StudentAppUtil.*;

public class StudentController {
	
	private StudentDatabase database;
	
	public StudentController() {
		database = new StudentDatabase();
	}
	
	public void save() {
		try(var reader = new BufferedReader(new InputStreamReader(System.in))) {
			
			// get input for name, age, gender, phone
			String name = getString(reader, "Enter name: ");
			if(checkString(name)) {
				throw new StudentException("Name input needs.");
			}
			
			String ageStr = getString(reader, "Enter age: ");
			if(checkString(ageStr)) {
				throw new StudentException("Age input needs.");
			}
			
			int age = Integer.parseInt(ageStr);
			if(age <= 5) {
				throw new StudentException("Age must be greater than five.");
			}
			
			String genderStr = getString(reader, "Enter gender: ");
			if(checkString(genderStr)) {
				throw new StudentException("Gender input needs.");
			}
			
			Gender gender = Gender.valueOf(genderStr);
			
			String phone = getString(reader, "Enter phone: ");

			// create student object and save into database			
			Student student = new Student();
			student.setName(name);
			student.setAge(age);
			student.setGender(gender);
			student.setPhone(phone);
			
			database.insert(student);
			
			
		} catch(NumberFormatException e) {
			System.err.println("Enter digit only for age!");
		} catch(IllegalArgumentException e) {
			throw new StudentException("Enter Male or Female for gender!", e);
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
