package com.jdc.creation.factory;

import com.jdc.creation.Course;

public class InstanceCourseFactory {
	
	public Course create() {
		var course = new Course();
		course.setName("Spring Full Stack");
		course.setFees(500000d);
		course.setLevel("Medium");
		course.setDuration(5);
		return course;
	}

}
