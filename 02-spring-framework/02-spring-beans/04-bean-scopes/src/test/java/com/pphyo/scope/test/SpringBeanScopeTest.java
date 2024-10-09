package com.pphyo.scope.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pphyo.scope.ScopeConfig;
import com.pphyo.scope.beans.EgarSingletonBean;
import com.pphyo.scope.beans.LazySingletonBean;

public class SpringBeanScopeTest {
	
	void test_for_xml_config() {
		try(var context = new ClassPathXmlApplicationContext()) {
			context.setConfigLocation("beans.xml");
			context.refresh();
			
			var lsb1 = context.getBean(LazySingletonBean.class);
			var lsb2 = context.getBean(LazySingletonBean.class);
			
			assertTrue(lsb1 == lsb2);
			
			var esb1 = context.getBean(EgarSingletonBean.class);
			var esb2 = context.getBean(EgarSingletonBean.class);
			
			assertTrue(esb1 == esb2);
			System.out.println(esb1.getMessage());
			
			var pb1 = context.getBean("prototypeBean");
			var pb2 = context.getBean("prototypeBean");
			
			assertFalse(pb1 == pb2);
		}
	}
	
	void test_for_annotation_config() {
		try(var context = new AnnotationConfigApplicationContext("com.pphyo.scope.beans")) {

			var lsb1 = context.getBean(LazySingletonBean.class);
			var lsb2 = context.getBean(LazySingletonBean.class);
			
			assertTrue(lsb1 == lsb2);
			
			var esb1 = context.getBean(EgarSingletonBean.class);
			var esb2 = context.getBean(EgarSingletonBean.class);
			
			assertTrue(esb1 == esb2);
			
			var pb1 = context.getBean("prototypeBean");
			var pb2 = context.getBean("prototypeBean");
			
			assertFalse(pb1 == pb2);
		}
	}
	
	@Test
	void test_for_java_config() {
		try(var context = new AnnotationConfigApplicationContext(ScopeConfig.class)) {

			var lsb1 = context.getBean(LazySingletonBean.class);
			var lsb2 = context.getBean(LazySingletonBean.class);
			
			assertTrue(lsb1 == lsb2);
			
			var esb1 = context.getBean(EgarSingletonBean.class);
			var esb2 = context.getBean(EgarSingletonBean.class);
			
			assertTrue(esb1 == esb2);
			
			System.out.println(esb1.getMessage());
			
			showBeanDefinition(context);
			
			var pb1 = context.getBean("prototypeBean");
			var pb2 = context.getBean("prototypeBean");
			
			assertFalse(pb1 == pb2);
			
		}
	}
	
	private void showBeanDefinition(ApplicationContext ctx) {
		var names = ctx.getBeanDefinitionNames();
		
		for(var name : names) {
			
			var aliases = ctx.getAliases(name);
			
			System.out.printf("Bean Name: %s", name);
			
			if(aliases.length > 0) {
				
				System.out.print(" | Aliases: ");
				
				for(var i = 0; i < aliases.length; i ++) {
					System.out.print(aliases[i]);
					
					if(i != aliases.length - 1) {
						System.out.print(", ");
					}
				}
			}
			System.out.println();
		}
	}

}
