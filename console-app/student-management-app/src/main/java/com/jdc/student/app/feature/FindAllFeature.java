package com.jdc.student.app.feature;

import com.jdc.student.app.model.StudentOutput;

public class FindAllFeature extends StudentCrudFeature {

	public FindAllFeature() {
		super(4, "Find All Students");
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

}
