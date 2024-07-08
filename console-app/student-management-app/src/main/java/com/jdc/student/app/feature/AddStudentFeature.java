package com.jdc.student.app.feature;

import static com.jdc.student.impl.util.ExceptionMessageHandler.checkDate;
import static com.jdc.student.impl.util.ExceptionMessageHandler.checkInput;
import static com.jdc.core.ChangeLanguageService.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.jdc.core.ChangeLanguageService;
import com.jdc.core.InputUtils;
import com.jdc.student.api.domain.Student;

public class AddStudentFeature extends StudentCrudFeature {
	
	public AddStudentFeature() {
		super(1, ChangeLanguageService.getResource().getString("app.menu.one"));
	}
	
	private void init() {
		Student stu1 = new Student();
		stu1.setName("Adam");
		stu1.setDob(LocalDate.of(2004, 9, 20));
		stu1.setRollNo("ROL-00221");
		stu1.setFatherName("David");
		stu1.setAddress("123 Broad Way Taxas");
		
		Student stu2 = new Student();
		stu2.setName("Mark William");
		stu2.setDob(LocalDate.of(2006, 1, 2));
		stu2.setRollNo("ROL-00012");
		stu2.setFatherName("Gorge Era");
		stu2.setAddress("012 Love Lane New York");
		
		Student stu3 = new Student();
		stu3.setName("Isabela Merced");
		stu3.setDob(LocalDate.of(2002, 6, 20));
		stu3.setRollNo("ROL-00005");
		stu3.setFatherName("Paul Warner");
		stu3.setAddress("1111 Champaing Las Vegas");
		
		studentApi.add(stu1);
		studentApi.add(stu2);
		studentApi.add(stu3);
	}

	@Override
	public void doBusiness() {
		try {
			init();
			// get name input
			var name = InputUtils.readString(getResource().getString("app.add.name"));
			checkInput(name, "Name");
			
			// get dob input
			var dateString = InputUtils.readString(getResource().getString("app.add.dob"));
			checkInput(dateString, "Date of birth");
			var dob = LocalDate.parse(dateString);
			checkDate(dob);
			
			// get roll no input
			var rollNo = InputUtils.readString(getResource().getString("app.add.roll"));
			checkInput(rollNo, "Roll no");
			
			// get father name input
			var fatherName = InputUtils.readString(getResource().getString("app.add.fname"));
			checkInput(fatherName, "Father name");
			
			// get address input
			var address = InputUtils.readString(getResource().getString("app.add.address"));
			checkInput(address, "Address");
			
			var student = new Student();
			student.setName(name);
			student.setDob(dob);
			student.setRollNo(rollNo);
			student.setFatherName(fatherName);
			student.setAddress(address);
			
			studentApi.add(student);
			
			System.out.println();
			System.out.println(getResource().getString("app.add.success"));
			
		} catch (DateTimeParseException e) {
			System.out.println();
			System.out.println("Enter valid date format -> (yyyy-MM-dd)");
		} catch (Exception e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void refreshMenu() {
		setFeatureName(ChangeLanguageService.getResource().getString("app.menu.one"));
	}

}
