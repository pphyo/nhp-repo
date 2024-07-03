package com.pphyo.oop.composition;

public class Car {

	private String model;
	private int wheel;

	public Car(String model, int wheel) {
		super();
		this.model = model;
		this.wheel = wheel;
	}
	
	public void move() {
		System.out.println("Car is moving...");
	}
	
	public void stop() {
		System.out.println("Car is stopped...");
	}

	public String getModel() {
		return model;
	}

	public int getWheel() {
		return wheel;
	}

}
