package com.pphyo.builder.car;

public class CarBuilder {
	
	private Car car;
	
	public CarBuilder() {
		car = new Car();
	}
	
	public CarBuilder addModel(String model) {
		car.setModel(model);
		return this;
	}
	
	public CarBuilder addColor(String color) {
		car.setColor(color);
		return this;
	}
	
	public CarBuilder addFuelType(String fuelType) {
		car.setFuelType(fuelType);
		return this;
	}
	
	public CarBuilder addHorsePower(int horsePower) {
		car.setHorsePower(horsePower);
		return this;
	}
	
	public CarBuilder addMaxSpeed(int maxSpeed) {
		car.setMaxSpeed(maxSpeed);
		return this;
	}
	
	public CarBuilder addCapacity(int capacity) {
		car.setCapacity(capacity);
		return this;
	}
	
	public CarBuilder addKiloPerHour(double kiloPerHour) {
		car.setKiloPerHour(kiloPerHour);
		return this;
	}
	
	public CarBuilder addPermit(boolean permit) {
		car.setPermit(permit);
		return this;
	}
	
	public Car build() {
		return car;
	}
}
