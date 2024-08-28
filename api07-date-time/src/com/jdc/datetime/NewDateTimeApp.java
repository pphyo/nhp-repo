package com.jdc.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeApp {
	
	public static void main(String[] args) {
		
		var ldt = LocalDateTime.now();
		
		var result = ldt.adjustInto(LocalDateTime.of(LocalDate.of(2024, 8, 8), LocalTime.of(19, 37)));
		
		System.out.println(result);
		
	}

}
