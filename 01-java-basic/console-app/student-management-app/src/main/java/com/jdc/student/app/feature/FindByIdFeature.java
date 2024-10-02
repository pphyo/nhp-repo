package com.jdc.student.app.feature;

import java.util.List;

import com.jdc.core.ChangeLanguageService;
import com.jdc.core.InputUtils;
import com.jdc.student.app.model.StudentOutput;

public class FindByIdFeature extends StudentCrudFeature {

	public FindByIdFeature() {
		super(3, ChangeLanguageService.getResource().getString("app.menu.three"));
	}

	@Override
	public void doBusiness() {
		try {
			var id = InputUtils.readInt("Enter Student ID: ");
			
			var student = studentApi.findById(id);
			
			var output = new StudentOutput(List.of(student));
			output.printTable();
			
		} catch (NumberFormatException e) {
			System.out.println();
			System.out.println("Enter digit for ID");
		} catch (Exception e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
		
	}
	
	@Override
	public void refreshMenu() {
		setFeatureName(ChangeLanguageService.getResource().getString("app.menu.three"));
	}

}
