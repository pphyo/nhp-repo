package com.jdc.app.ex;

@SuppressWarnings("serial")
public class StudentException extends RuntimeException {

	public StudentException(String message) {
		super(message);
	}
	
	public StudentException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
