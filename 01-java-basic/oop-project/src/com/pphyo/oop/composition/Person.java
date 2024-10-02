package com.pphyo.oop.composition;

public class Person {

	private String name;
	// has a
	private Car car;
	
	public void driveCar() {
		car.move();
		System.out.println("Person is driving car...");
	}
	
	public void stopCar() {
		System.out.println("Person stopped the car...");
		car.stop();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
