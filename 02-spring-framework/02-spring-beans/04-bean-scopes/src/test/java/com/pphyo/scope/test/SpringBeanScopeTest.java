package com.pphyo.scope.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pphyo.scope.ScopeConfig;
import com.pphyo.scope.beans.EgarSingletonBean;
import com.pphyo.scope.beans.LazySingletonBean;
import com.pphyo.scope.beans.PrototypeBean;

// Stateful bean and Stateless bean => JavaEE
// Prototype bean and Singleton bean => Spring

public class SpringBeanScopeTest {
	
	@Test
	@Disabled
	void test_for_xml_config() {
		try(var context = new ClassPathXmlApplicationContext()) {
			context.setConfigLocation("beans.xml");
			context.refresh();
			
			var egarBean1 = context.getBean(EgarSingletonBean.class);
			var egarBean2 = context.getBean(EgarSingletonBean.class);
			
			assertTrue(egarBean1 == egarBean2);
			
			var lazyBean1 = context.getBean(LazySingletonBean.class);
			var lazyBean2 = context.getBean(LazySingletonBean.class);
			
			assertTrue(lazyBean1 == lazyBean2);

			var pBean1 = context.getBean(PrototypeBean.class);
			var pBean2 = context.getBean(PrototypeBean.class);
			
			assertFalse(pBean1 == pBean2);
			
		}
	}
	
	@Test
	@Disabled
	void test_for_annotation_config() {
		try(var context = new AnnotationConfigApplicationContext("com.pphyo.scope.beans")) {

			var egarBean1 = context.getBean(EgarSingletonBean.class);
			var egarBean2 = context.getBean(EgarSingletonBean.class);
			
			assertTrue(egarBean1 == egarBean2);
			
			var lazyBean1 = context.getBean(LazySingletonBean.class);
			var lazyBean2 = context.getBean(LazySingletonBean.class);
			
			assertTrue(lazyBean1 == lazyBean2);

			var pBean1 = context.getBean(PrototypeBean.class);
			var pBean2 = context.getBean(PrototypeBean.class);
			
			assertFalse(pBean1 == pBean2);
			
		}
	}
	
	@Test
//	@Disabled
	void test_for_java_config() {
		try(var context = new AnnotationConfigApplicationContext(ScopeConfig.class)) {

			var egarBean1 = context.getBean(EgarSingletonBean.class);
			var egarBean2 = context.getBean(EgarSingletonBean.class);
			
			assertTrue(egarBean1 == egarBean2);
			
			var lazyBean1 = context.getBean(LazySingletonBean.class);
			var lazyBean2 = context.getBean(LazySingletonBean.class);
			
			assertTrue(lazyBean1 == lazyBean2);

			var pBean1 = context.getBean(PrototypeBean.class);
			var pBean2 = context.getBean(PrototypeBean.class);
			
			assertFalse(pBean1 == pBean2);
			
		}
	}
	

}
