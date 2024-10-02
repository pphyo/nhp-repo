package com.jdc.app.ex;

public class StudentException extends RuntimeException {

	@java.io.Serial
	static final long serialVersionUID = 8474224888142643989L;

	public StudentException(String message) {
		super(message);
	}
	
	public StudentException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
