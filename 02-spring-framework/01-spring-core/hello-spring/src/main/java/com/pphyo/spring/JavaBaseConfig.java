package com.pphyo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pphyo.spring.anno.MessageService;

@Configuration
@ComponentScan
public class JavaBaseConfig {
	
	@Bean
	List<String> list() {
		return new ArrayList<>();
	}
	
	@Bean
	MessageService service() {
		return new MessageService();
	}

}
