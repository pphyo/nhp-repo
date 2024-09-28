package com.jdc.creation.factory;

import com.jdc.creation.Course;

public class StaticCourseFactory {
	
	public static Course create(String name, double fees, String level, int duration) {
		var course = new Course();
		course.setName(name);
		course.setFees(fees);
		course.setLevel(level);
		course.setDuration(duration);
		return course;
	}

}
