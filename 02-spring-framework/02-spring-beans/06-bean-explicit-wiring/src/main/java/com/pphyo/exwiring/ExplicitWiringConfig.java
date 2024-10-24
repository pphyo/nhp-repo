package com.pphyo.exwiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pphyo.exwiring.beans.AppService;
import com.pphyo.exwiring.beans.MessageService;
import com.pphyo.exwiring.beans.PopService;

@Configuration
public class ExplicitWiringConfig {

	@Bean
	MessageService popService() {
		return new PopService();
	}

	@Bean
	AppService appService(MessageService service) {
		return new AppService(service);
	}

}
