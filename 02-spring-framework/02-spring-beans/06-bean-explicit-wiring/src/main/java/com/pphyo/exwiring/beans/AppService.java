package com.pphyo.exwiring.beans;

import org.springframework.stereotype.Service;

@Service
public class AppService {

	private final MessageService service;

	public AppService(MessageService service) {
		this.service = service;
	}

	public void inform() {
		service.send("App service message");
	}

}
