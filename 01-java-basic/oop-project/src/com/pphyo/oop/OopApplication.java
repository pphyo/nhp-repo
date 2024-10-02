package com.pphyo.oop;

import com.pphyo.oop.encapsulation.Customer;
import com.pphyo.oop.inheritance.DailyEmployee;
import com.pphyo.oop.inheritance.Employee;

class Sample {}

public class OopApplication {

	public static void main(String[] args) {
		runForAbstract();
	}
	
	static void runForAbstract() {
		// anonymous inner class
//		Animal anonymous = new Animal("", "") {
//			@Override
//			public void eat() {
//			}
//		};
		
//		Animal ani = new Lion("", "");
	}
	
	static void runForOverload() {
//		new Employee("", 0.0, "", true);
	}
	
	// Super => Sub
	// Parent => Child
	// Base => Derived
	static void runForInheritance() {
		
//		Person person = (Person)new UniversalPerson(); // Explicit
//		System.out.println(person);
		
		Employee emp = new DailyEmployee();

		if(emp instanceof DailyEmployee dailyEmp) {
			System.out.println("Daily Emp: " + dailyEmp);
		}
		
		System.out.println("Program terminate");
	}
	
	static void runForEncapsulation() {
		Customer customer = new Customer("Mg Mg");
		customer.setName("Htun Tun");
		customer.setAge(20);

		System.out.println(customer.getName());
		System.out.println(customer.getAge());
		System.out.println(customer.getAddress());
	}

}
