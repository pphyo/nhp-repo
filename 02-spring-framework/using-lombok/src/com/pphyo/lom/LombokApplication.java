package com.pphyo.lom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokApplication {
	
//	static {
//		setLoggerHandler(Level.FINEST);
//	}

	public static void main(String[] args) {
		var account = Account.builder()
				.email("pyaephyo@gmail.com")
				.password("pyaephyo")
				.age(10)
				.role("Admin")
				.build();
		
		var account2 = Account.builder()
				.email("pyaephyo@gmail.com")
				.password("pyaephyo")
				.age(10)
				.role("Admin")
				.build();
		
		System.out.println(account.equals(account2));
		
//		var hh = new Student("Hla Hla", 14);
//		
//		var kk = hh.withName("Kyaw Kyaw").withAge(17);
		
		log.trace("This is a fine log.");

		log.warn("This is warning log.");
		
		log.info("This is info log.");
		
		log.error("This is error log.");
		
	}
	
//	static void setLoggerHandler(Level level) {
//		log.setLevel(level);
//		var handler = new ConsoleHandler();
//		handler.setFormatter(new ColorFormatter());
//		handler.setLevel(level);
//		log.addHandler(handler);
//	}
	
	static Connection getDbConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("", "", "");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		return conn;
	}
	
	static class AccountManager {

		public AccountManager(@NonNull Account account) {
			System.out.println(account.getEmail());
		}
		
		
	}

}