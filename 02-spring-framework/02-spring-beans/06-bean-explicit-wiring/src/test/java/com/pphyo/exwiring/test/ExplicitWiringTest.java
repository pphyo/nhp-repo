package com.pphyo.exwiring.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pphyo.exwiring.ExplicitWiringConfig;
import com.pphyo.exwiring.beans.AppService;

public class ExplicitWiringTest {
	
	@Test
	@Disabled
	void test_for_xml_config() {
		try(var ctx = new ClassPathXmlApplicationContext("applications.xml")) {
			var service = ctx.getBean(AppService.class);
			service.inform();
		}
	}
	
	@Test
	@Disabled
	void test_for_annotation_config() {
		try(var ctx = new AnnotationConfigApplicationContext("com.pphyo.exwiring.beans")){
			var service = ctx.getBean(AppService.class);
			service.inform();
		}
	}
	
	@Test
//	@Disabled
	void test_for_java_config() {
		try(var ctx = new AnnotationConfigApplicationContext(ExplicitWiringConfig.class)) {
			var service = ctx.getBean(AppService.class);
			service.inform();
		}
	}

}
