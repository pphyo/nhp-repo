package com.pphyo.lifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AppService implements InitializingBean, DisposableBean {
	
	public AppService() {
		System.out.println("AppService constructor");
	}
		
	@PostConstruct
	void afterCreate() {
		System.out.println("PostConstruct in AppService");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AppService->InitializingBean :: afterPropertiesSet");		
	}
	
	void initInService() {
		System.out.println("Init bean method in service");
	}
	
	@PreDestroy
	void beforeRemove() {
		System.out.println("PreDestroy in AppService");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("AppService->DisposableBean :: destroy");
	}

	void destroyInService() {
		System.out.println("destroy bean method in service");
	}
}
