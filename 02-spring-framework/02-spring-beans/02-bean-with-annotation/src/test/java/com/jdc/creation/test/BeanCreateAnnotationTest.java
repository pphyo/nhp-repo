package com.jdc.creation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.creation.Course;
import com.jdc.creation.JavaBaseConfig;
import com.jdc.creation.factory.InstanceCourseFactory;

public class BeanCreateAnnotationTest {
	
	@Test
	void test1() {
		try(var ctx = new AnnotationConfigApplicationContext(JavaBaseConfig.class)) {
			
			var simpleCourse = ctx.getBean("simpleCourseBean", Course.class);
			assertNotNull(simpleCourse);
			assertEquals("Java SE", simpleCourse.getName());
			assertEquals(300_000, simpleCourse.getFees());
			assertEquals(3, simpleCourse.getDuration());
			
			var staticCourse = ctx.getBean("staticCourseBean", Course.class);
			assertNotNull(staticCourse);
			
			var instanceCourse = ctx.getBean("instanceCourseBean", Course.class);
			assertNotNull(instanceCourse);
			
			assertThrows(NoSuchBeanDefinitionException.class, () -> ctx.getBean(InstanceCourseFactory.class));
			
		}
	}

}
