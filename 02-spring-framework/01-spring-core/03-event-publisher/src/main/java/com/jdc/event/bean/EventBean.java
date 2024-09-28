package com.jdc.event.bean;

import java.time.LocalDateTime;

public record EventBean(String message, LocalDateTime issuedAt) {

	public EventBean(String message) {
		this(message, LocalDateTime.now());
	}
	
}
