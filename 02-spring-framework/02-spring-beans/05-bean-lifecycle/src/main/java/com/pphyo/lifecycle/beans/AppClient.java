package com.pphyo.lifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AppClient implements InitializingBean, DisposableBean {
	
	public AppClient(AppService service) {
		System.out.println("AppClient constructor");
	}
	
	public void initInClient() {
		System.out.println("Init bean method in client");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AppClient->InitializingBean :: afterPropertiesSet");		
	}
	
	@PostConstruct
	void afterCreate() {
		System.out.println("PostConstruct in AppClient");
	}
	
	@PreDestroy
	void beforeRemove() {
		System.out.println("PreDestroy in AppClient");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("AppClient->DisposableBean :: destroy");
	}
	
	void destroyInClient() {
		System.out.println("destroy bean method in client");
	}
}
