package com.jdc.pp.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.jdc.pp.beans.MyBean;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
		
	public MyBeanPostProcessor() {
		System.out.println("beanPostProcessor is created.");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization is called.");
		
		if(bean instanceof MyBean myBean) {
			myBean.setValue("Value added from BeanPostProccessor.");
		}
		
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization is called.");
		
		return bean;
	}

}
