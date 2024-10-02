package com.jdc.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDateApp {

	public static void main(String[] args) {
		
		var cal = Calendar.getInstance();
		System.out.println(cal);
		
		getField(cal);
		
//		cal.setLenient(false);
		
		cal.set(Calendar.HOUR_OF_DAY, 26);
		
		getField(cal);
		
		addAndRoll();
		
//		var d = new Date(124, 9, 11);
//		System.out.println(d);

	}
	
	public static void addAndRoll() {
		try {
			Date d = new
					SimpleDateFormat("yyyyMMdd").parse("20130410");
					Calendar c1 = Calendar.getInstance();
					Calendar c2 = Calendar.getInstance();
					c1.setTime(d);
					c2.setTime(d);
					c1.add(Calendar.DAY_OF_MONTH, -15);
					c2.roll(Calendar.DAY_OF_MONTH, -15);
					System.out.println(c1.getTime());
					System.out.println(c2.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getField(Calendar c) {
		// get
		System.out.println("Year: " + c.get(Calendar.YEAR));
		System.out.println("Month: " + c.get(Calendar.MONTH));
		System.out.println("Day of month: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hour of day: " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Week of month: " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Day of week in month: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Millis time: " + c.getTimeInMillis());
		System.out.println("Time: " + c.getTime());
		System.out.println();
	}

}
