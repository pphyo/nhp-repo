package com.jdc.student.app.feature;

import java.time.format.DateTimeParseException;

import com.jdc.core.InputUtils;

public class EditStudentFeature extends StudentCrudFeature {

	public EditStudentFeature() {
		super(2, "Edit Student");
	}

	@Override
	public void doBusiness() {
		System.out.println("Enter value for update or leave blank and enter.");
		System.out.println();
		
		try {
			var idForEdit = InputUtils.readInt("Enter ID for edit: ");
			
			var studentForEdit = studentApi.findById(idForEdit);
			
			var nameForEdit = InputUtils.readString("Enter name for edit: ");
			var dobForEdit = InputUtils.readString("Enter dob for edit: ");
			var rollNumberForEdit = InputUtils.readString("Enter roll no for edit: ");
			var fatherNameForEdit = InputUtils.readString("Enter father name for edit: ");
			var addressForEdit = InputUtils.readString("Enter address for edit: ");
			
			
			
			studentApi.update(idForEdit, studentForEdit);
		} catch (DateTimeParseException e) {
			System.out.println();
			System.out.println("Enter valid date format -> (yyyy-MM-dd)");
		}  catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
