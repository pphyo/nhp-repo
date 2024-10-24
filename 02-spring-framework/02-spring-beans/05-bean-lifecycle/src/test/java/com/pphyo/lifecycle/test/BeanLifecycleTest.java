package com.pphyo.lifecycle.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifecycleTest {
	
	@Test
	void test() {
		try(var ctx = new AnnotationConfigApplicationContext("com.pphyo.lifecycle")) {
			
		}
	}

}
