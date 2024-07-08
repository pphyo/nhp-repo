package com.jdc.student.impl.util;

import java.time.LocalDate;

import com.jdc.core.StringUtils;

public class ExceptionMessageHandler {
	
	public static void checkIndex(int index, String domainName) {
		if(index < 0) {
			throw new SMException("No %s found with index %d!".formatted(domainName, index));
		}
	}
	
	public static void checkId(int id, String domain) {
		throw new SMException("No %s found with Id %d!".formatted(domain, id));
	}

	
	public static void checkInput(String input, String domainName) {
		if(StringUtils.isEmpty(input)) {
			throw new SMException("Please enter %s!".formatted(domainName));
		}
	}
	
	public static void checkDate(LocalDate date) {
		var now = LocalDate.now();
		// future
		if(date.isAfter(now)) {
			throw new SMException("Pelase enter valid dob!");
		}
		
		if(now.compareTo(date) < 5) {
			throw new SMException("5 years old and above students are accepted!");
		}
	}

}
