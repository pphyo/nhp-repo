package com.pphyo.lom;

import lombok.NonNull;

public class LombokApplication {

	public static void main(String[] args) {
		var account = new Account();
		account.setEmail("pyaephyo@gmail.com");
		account.setPassword("pyaephyo");
		account.setAge(10);
		account.setRole("Admin");
		
		var account2 = new Account();
		account2.setEmail("pyaephyo@gmail.com");
		account2.setPassword("pyaephyo");
		account2.setAge(10);
		account2.setRole("Student");
		
		System.out.println(account.equals(account2));
		

	}
	
	static class AccountManager {

		public AccountManager(@NonNull Account account) {
			System.out.println(account.getEmail());
		}
		
		
	}

}