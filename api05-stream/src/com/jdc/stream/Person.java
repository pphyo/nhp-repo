package com.jdc.stream;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	private Gender gender;
	
	public Person() {}
	
	public Person(String text) {
		var arr = text.split("\\,");
		setName(arr[0].trim());
		setAge(Integer.parseInt(arr[1].trim()));
		setGender(Gender.valueOf(arr[2].trim()));
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public enum Gender {
		Male, Female, Other
	}
	
	public String toString() {
		return "Name: %s | Age: %d | Gender: %s".formatted(name, age, gender.name());
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.getName());
	}

}
