package com.pphyo.j21.enm;

public class AfterEnum {
	
	public static void main(String[] args) {
		run2();
	}
	
	static void run2() {
		System.out.println(Course.JavaSE.name());
		System.out.println(Course.JavaSE.courseName());
		System.out.println(Course.JavaSE.feesFormat());
		
		for (String ol : Course.Angular.outlines()) {
			System.out.println(ol);	
		}
	}
	
	static void run1() {
		var day = Days.TUE;
		
		System.out.println("""
				name: %s
				ordinal: %d
				""".formatted(day.name(), day.ordinal()));
		
		Days[] days = Days.values();
		for(Days d : days) {
			System.out.println("""
					name: %s | ordinal: %d""".formatted(d.toString(), d.ordinal()));
		}
		
 		Days wed = Days.valueOf("WEDS");
 		System.out.println(wed);
	}

}
