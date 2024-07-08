package com.jdc.student.app.feature;

import static com.jdc.core.StringUtils.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.jdc.core.ChangeLanguageService;
import com.jdc.core.InputUtils;

public class EditStudentFeature extends StudentCrudFeature {

	public EditStudentFeature() {
		super(2, ChangeLanguageService.getResource().getString("app.menu.two"));
	}

	@Override
	public void doBusiness() {
		
		try {
			var idForEdit = InputUtils.readInt("Enter ID for edit: ");
			
			var studentForEdit = studentApi.findById(idForEdit);
			
			System.out.println();
			System.out.println("Enter value for update or leave blank and enter if you don't want to update.");
			System.out.println();

			var nameForEdit = InputUtils.readString("Enter name for edit: ");
			var dobForEdit = InputUtils.readString("Enter dob for edit: ");
			var rollNumberForEdit = InputUtils.readString("Enter roll no for edit: ");
			var fatherNameForEdit = InputUtils.readString("Enter father name for edit: ");
			var addressForEdit = InputUtils.readString("Enter address for edit: ");
			
			studentForEdit.setName(isEmpty(nameForEdit) ? studentForEdit.getName() : nameForEdit);
			studentForEdit.setDob(isEmpty(dobForEdit) ? studentForEdit.getDob() : LocalDate.parse(dobForEdit));
			studentForEdit.setRollNo(isEmpty(rollNumberForEdit) ? studentForEdit.getRollNo() : rollNumberForEdit);
			studentForEdit.setFatherName(isEmpty(fatherNameForEdit) ? studentForEdit.getFatherName() : fatherNameForEdit);
			studentForEdit.setAddress(isEmpty(addressForEdit) ? studentForEdit.getAddress() : addressForEdit);
			
			studentApi.update(idForEdit, studentForEdit);
			
			System.out.println();
			System.out.println("Edit student successfully.");
			
		} catch (DateTimeParseException e) {
			System.out.println();
			System.out.println("Enter valid date format -> (yyyy-MM-dd)");
		} catch (NumberFormatException e) {
			System.out.println();
			System.out.println("Enter digit for ID");
		} catch(Exception e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
		
	}
	
	@Override
	public void refreshMenu() {
		setFeatureName(ChangeLanguageService.getResource().getString("app.menu.two"));
	}

}
