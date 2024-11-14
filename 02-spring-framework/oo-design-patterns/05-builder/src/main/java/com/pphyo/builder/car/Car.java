package com.pphyo.builder.car;

public class Car {

	private String model;
	private String color;
	private String fuelType;
	private int horsePower;
	private int maxSpeed;
	private int capacity;
	private double kiloPerHour;
	private boolean permit;

	Car() {}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getKiloPerHour() {
		return kiloPerHour;
	}

	public void setKiloPerHour(double kiloPerHour) {
		this.kiloPerHour = kiloPerHour;
	}

	public boolean isPermit() {
		return permit;
	}

	public void setPermit(boolean permit) {
		this.permit = permit;
	}

}
