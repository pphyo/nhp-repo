package com.pphyo.scope.beans;

import org.springframework.stereotype.Component;

@Component("egarBean")
public class EgarSingletonBean {
	
	private String message;

	public EgarSingletonBean(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
