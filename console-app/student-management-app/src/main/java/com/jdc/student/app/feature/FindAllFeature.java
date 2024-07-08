package com.jdc.student.app.feature;

import com.jdc.core.ChangeLanguageService;
import com.jdc.student.app.model.StudentOutput;

public class FindAllFeature extends StudentCrudFeature {

	public FindAllFeature() {
		super(4, ChangeLanguageService.getResource().getString("app.menu.four"));
	}

	@Override
	public void doBusiness() {
		var result = studentApi.findAll();
		if(result.size() > 0) {
			var output = new StudentOutput(result);
			output.printTable();
		} else {
			System.out.println("No student found!");
		}
	}
	
	@Override
	public void refreshMenu() {
		setFeatureName(ChangeLanguageService.getResource().getString("app.menu.four"));
	}

}
