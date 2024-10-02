package com.jdc.pp.beans;

import org.springframework.stereotype.Component;

@Component("defaultBean")
public class MyBean {

	private String value;
	
	public MyBean() {
		System.out.println("MyBean is created.");
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
