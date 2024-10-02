package com.jdc.creation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.creation.Course;

public class BeanCreationTest {
	
	@Test
	void test() {
		
		try(var context = new GenericXmlApplicationContext("classpath:/application.xml")) {
			
			var staticCourseBean = context.getBean("staticCourseBean", Course.class);
			
			assertNotNull(staticCourseBean);
			assertEquals("Java Basic", staticCourseBean.getName());
			assertEquals(300_000d, staticCourseBean.getFees());
			assertEquals("Basic", staticCourseBean.getLevel());
			assertEquals(3, staticCourseBean.getDuration());
			
			var instanceCourseBean = context.getBean("instanceCourseBean", Course.class);
			
			assertNotNull(instanceCourseBean);
			assertEquals("Spring Full Stack", instanceCourseBean.getName());
			assertEquals(500_000d, instanceCourseBean.getFees());
			assertEquals("Medium", instanceCourseBean.getLevel());
			assertEquals(5, instanceCourseBean.getDuration());
			
		}
		
	}

}
