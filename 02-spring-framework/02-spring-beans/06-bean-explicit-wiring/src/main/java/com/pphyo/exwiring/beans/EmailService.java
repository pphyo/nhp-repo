package com.pphyo.exwiring.beans;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

	@Override
	public void send(String message) {
		System.out.printf("'%s' is sent from email service.%n", message);
	}

}
