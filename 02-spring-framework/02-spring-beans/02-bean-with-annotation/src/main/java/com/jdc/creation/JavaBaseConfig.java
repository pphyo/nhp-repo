package com.jdc.creation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.creation.factory.InstanceCourseFactory;
import com.jdc.creation.factory.StaticCourseFactory;

@Configuration
public class JavaBaseConfig {
	
	@Bean
	Course simpleCourseBean() {
		var course = new Course();
		course.setName("Java SE");
		course.setFees(300_000);
		course.setLevel("Basic");
		course.setDuration(3);
		return course;
	}
	
	@Bean
	Course staticCourseBean() {
		return StaticCourseFactory.create("Spring Framework", 450_000, "Intermediate", 5);
	}
	
	@Bean
	Course instanceCourseBean() {
		var factory = new InstanceCourseFactory();
		return factory.create();
	}

}
