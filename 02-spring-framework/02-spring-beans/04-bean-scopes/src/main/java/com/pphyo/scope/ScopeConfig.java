package com.pphyo.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.pphyo.scope.beans.PrototypeBean;
import com.pphyo.scope.beans.EgarSingletonBean;
import com.pphyo.scope.beans.LazySingletonBean;

@Configuration
@ComponentScan(basePackages = "com.pphyo.scope.beans")
public class ScopeConfig {
	
	@Bean(name = "egarBean")
	EgarSingletonBean egarSingletonBean() {
		return new EgarSingletonBean("Message from java basic config.");
	}
	
	@Bean(name = "lazyBean")
	@Lazy
	LazySingletonBean lazySingletonBean() {
		return new LazySingletonBean();
	}
	
	@Bean
	@Scope("prototype")
	PrototypeBean prototypeBean() {
		return new PrototypeBean();
	}
	
	@Bean
	String string() {
		return "Message from annotation config.";
	}

}
