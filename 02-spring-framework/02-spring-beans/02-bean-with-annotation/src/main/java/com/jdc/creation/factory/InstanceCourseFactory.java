package com.jdc.creation.factory;

import com.jdc.creation.Course;

public class InstanceCourseFactory {
	
	public Course create() {
		var course = new Course();
		course.setName("Angular Framework");
		course.setFees(400000d);
		course.setLevel("Intermediate");
		course.setDuration(4);
		return course;
	}

}
