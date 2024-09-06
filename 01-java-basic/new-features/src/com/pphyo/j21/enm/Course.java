package com.pphyo.j21.enm;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public enum Course {
	
	JavaSE("Java Standard Edition", 350_000) {
		@Override
		public String[] outlines() {
			return new String[] {"Language Fundamental", "OOP", "OO Design Principle", "Essential APIs"};
		}
	},
	JavaEE("Java Enterprise Edition", 450_000) {
		@Override
		public String[] outlines() {
			return new String[] {"Servlet", "JSP", "JSTL", "JSF", "CDI", "Backing Beans"};
		}
	},
	Spring("Spring Framework", 500_000) {
		@Override
		public String[] outlines() {
			return new String[] {"DI", "Spring Beans", "IOC", "AOP", "Spring Data", "MVC"};
		}
	},
	Angular("Angular Framework", 400_000) {
		@Override
		public String[] outlines() {
			return new String[] {"SPA", "DataBinding", "Forms", "Navigation", "Dependency Injection"};
		}
	};
	
	private static final NumberFormat DF = new DecimalFormat("#,###");
	private final String courseName;
	private final int fees;
	
	private Course(String courseName, int fees) {
		this.courseName = courseName;
		this.fees = fees;
	}
	
	public final String courseName() {
		return courseName;
	}
	
	public final int fees() {
		return fees;
	}
	
	public final String feesFormat() {
		return DF.format(fees);
	}
	
	public abstract String[] outlines();
}






