package com.jdc.principle.ocp;

public class AppleLogin implements LoginInterface {
	
	@Override
	public void login() {
		System.out.println("Apple login...");		
	}

}
