package com.pphyo.j21.record;

public record Account(String email, String password, String role, boolean delete) {

	// Explicit Canonical Constructor
//	public Account(String email, String password, String role, boolean delete) {
//		this.email = email;
//		this.password = password;
//		this.role = role;
//		this.delete = delete;
//	}
	
	public Account {
		if(null == email || email.isEmpty()) {
			throw new RuntimeException("Email is required.");
		}
	}
	
	public Account(String email, String password) {
		this(email, password, "Admin", false);
	}
	
}
