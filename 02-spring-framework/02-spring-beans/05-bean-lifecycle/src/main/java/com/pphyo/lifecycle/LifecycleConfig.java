package com.pphyo.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pphyo.lifecycle.beans.AppClient;
import com.pphyo.lifecycle.beans.AppService;

@Configuration
@ComponentScan
public class LifecycleConfig {

	@Bean(initMethod = "initInService", destroyMethod = "destroyInService")
	AppService appService() {
		return new AppService();
	}
	
	@Bean(initMethod = "initInClient", destroyMethod = "destroyInClient")
	AppClient appClient(AppService appService) {
		return new AppClient(appService);
	}
	
}
