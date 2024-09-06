package com.jdc.principle.ocp;

public class OcpApp {

	public static void main(String[] args) {
		
		SecurityService service = new SecurityService();
		service.login(new AppleLogin());

	}

}
