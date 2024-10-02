package com.jdc.singleton;

public class SingletonApp {

	public static void main(String[] args) {

		var service1 = SingletonService.getInstance("Service 1");
		var service2 = SingletonService.getInstance("Service 2");
		var service3 = SingletonService.getInstance("Service 3");
		var service4 = SingletonService.getInstance("Service 4");
		var service5 = SingletonService.getInstance("Service 5");
		
		System.out.println("""
				%s
				%s
				%s
				%s
				%s
				""".formatted(service1, service2, service3, service4, service5));

	}

}
