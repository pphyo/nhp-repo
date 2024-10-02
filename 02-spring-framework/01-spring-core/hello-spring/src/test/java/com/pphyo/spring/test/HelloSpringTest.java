package com.pphyo.spring.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.pphyo.spring.JavaBaseConfig;
import com.pphyo.spring.anno.AnnotationBean;
import com.pphyo.spring.anno.MessageService;
import com.pphyo.spring.xml.EmployeeService;

public class HelloSpringTest {
	
	static GenericApplicationContext context;
	
	@BeforeAll
	static void setUpBefore() {
		context = new AnnotationConfigApplicationContext(JavaBaseConfig.class);
	}
	
	@Test
	void testTwo() {
		@SuppressWarnings("unchecked")
		List<String> list = context.getBean(List.class);
		assertNotNull(list);
		
		var messageService = context.getBean("service", MessageService.class);
		assertNotNull(messageService);
		
		var annoBean = context.getBean("annotationBean", AnnotationBean.class);
		assertNotNull(annoBean);
		
		assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean(EmployeeService.class));
	}
	
	@Test
	@Disabled
	void testOne() {
		var utilDate = context.getBean("utilDate", Date.class);
		System.out.println(utilDate);
		
		var bean1 = context.getBean(EmployeeService.class);
		assertNotNull(bean1);
		
		var bean2 = context.getBean("empService", EmployeeService.class);
		assertNotNull(bean2);
		
		assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean("empSer"));
		
		var bean3 = context.getBean(MessageService.class);
		assertNotNull(bean3);
		
		var bean4 = context.getBean("messageService");
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
