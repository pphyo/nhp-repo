package com.jdc.sample;

import java.time.LocalDate;

public class DateFormatDemo {
	
	public static void main(String[] args) {
		String dateString = "10-";
		System.out.println(LocalDate.parse(dateString));
	}

}
