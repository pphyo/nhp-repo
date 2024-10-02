package com.jdc.name;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.name.beans.JavaBean;

@Configuration
public class AppConfig {
	
	@Bean(name = {
			"javaBean", "javaBean1", "javaBean2", "javaBean3"
	})
	JavaBean createJavaBean() {
		return new JavaBean();
	}
	
}
