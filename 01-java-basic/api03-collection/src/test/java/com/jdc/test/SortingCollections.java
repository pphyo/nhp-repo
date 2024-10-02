package com.jdc.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

public class SortingCollections {

	@Test
	void test_for_sort_nature_ordering_element() {
		
		Employee emp1 = new Employee("Zyan", 45000.94, true);
		Employee emp2 = new Employee("Eminem", 50000.43, false);
		Employee emp3 = new Employee("Angela", 32000.43, false);
		Employee emp4 = new Employee("Selena", 34000.30, true);
		
		var empList = Arrays.asList(emp1, emp2, emp3, emp4);
		Collections.sort(empList, new NameDescForEmployee());
		System.out.println(empList);
	}

}

class NameDescForEmployee implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}
}

class Employee implements Comparable<Employee> {
	
	private String name;
	private double salary;
	private boolean permanent;

	public Employee(String name, double salary, boolean permanent) {
		super();
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isPermanent() {
		return permanent;
	}
	
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", permanent=" + permanent + " | ";
	}

}
