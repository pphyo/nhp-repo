package com.jdc.pp.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.pp.AppConfig;
import com.jdc.pp.beans.MyBean;
import com.jdc.pp.processors.MyBeanFactoryPostProcessor;

public class PostProcessorTest {
	
	@Test
	void test() {
		try(var ctx = new AnnotationConfigApplicationContext()) {
			ctx.register(AppConfig.class);
			ctx.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
			
			ctx.refresh();
			
			var myBean = ctx.getBean(MyBean.class);
			System.out.println(myBean.getValue());
		}
	}

}
