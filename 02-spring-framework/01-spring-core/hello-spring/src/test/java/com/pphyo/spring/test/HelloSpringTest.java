package com.pphyo.spring.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.pphyo.spring.EmployeeService;
import com.pphyo.spring.MessageService;

public class HelloSpringTest {
	
	static GenericXmlApplicationContext context;
	
	@BeforeAll
	static void setUpBefore() {
		context = new GenericXmlApplicationContext("classpath:/beans.xml");
	}
	
	@Test
	void test() {
		var bean1 = context.getBean(EmployeeService.class);
		assertNotNull(bean1);
		
		var bean2 = context.getBean("empService", EmployeeService.class);
		assertNotNull(bean2);
		
		assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean("empSer"));
		
		var bean3 = context.getBean(MessageService.class);
		assertNotNull(bean3);
		
		var bean4 = context.getBean("msgService");
		assertNotNull(bean4);
		
		assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean("msgServic", MessageService.class));
	}
	
//	@Test
//	void test() {
//		String resourceLocation = "classpath:/beans.xml";
//		// initialize ioc container
//		var ctx = new GenericXmlApplicationContext();
//		
//		// loading configuration file
//		ctx.load(resourceLocation);
//		
//		// refresh ioc container
//		ctx.refresh();
//		// beans that register from ioc container are ready to use
//		
//		// request create bean from ioc
//		var service = ctx.getBean(EmployeeService.class);
//		
//		System.out.println(service.greet());
//		
//		ctx.close();
//		
//	}
	
	@AfterAll
	static void tearDownAfterClass() {
		context.close();
	}

}
