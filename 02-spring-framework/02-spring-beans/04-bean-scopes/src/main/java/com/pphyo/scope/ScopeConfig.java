package com.pphyo.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.pphyo.scope.beans.PrototypeBean;
import com.pphyo.scope.beans.EgarSingletonBean;
import com.pphyo.scope.beans.LazySingletonBean;

@Configuration
public class ScopeConfig {
	
	@Bean(name = {"egarBean"})
	EgarSingletonBean createEgarSingletonBean() {
		return new EgarSingletonBean();
	}
	
	@Bean(name = {"lazyBean"})
	@Lazy
	LazySingletonBean createLazySingletonBean() {
		return new LazySingletonBean();
	}
	
	@Bean(name = {"pBean"})
	@Scope("prototype")
	PrototypeBean createPrototypeBean() {
		return new PrototypeBean();
	}

}
