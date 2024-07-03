package com.jdc.student.app.feature;

import com.jdc.core.AbstractFeature;
import com.jdc.student.api.StudentApi;
import com.jdc.student.impl.StudentApiImpl;

public abstract class StudentCrudFeature extends AbstractFeature {
	
	protected StudentApi studentApi;

	public StudentCrudFeature(int id, String featureName) {
		super(id, featureName);
		studentApi = StudentApiImpl.getInstance();
	}

}
