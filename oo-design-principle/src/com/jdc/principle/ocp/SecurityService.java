package com.jdc.principle.ocp;

public class SecurityService {
	
	public void login(LoginInterface login) {
		login.login();
	}

}
