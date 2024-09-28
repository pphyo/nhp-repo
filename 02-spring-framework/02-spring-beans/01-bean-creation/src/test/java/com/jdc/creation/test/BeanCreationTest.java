package com.jdc.creation.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.creation.Course;

public class BeanCreationTest {
	
	@Test
	void test() {
		
		try(var context = new GenericXmlApplicationContext("classpath:/application.xml")) {
			
			var simpleCourseBean = context.getBean(Course.class);
			assertNotNull(simpleCourseBean);
			
		}
		
	}

}
