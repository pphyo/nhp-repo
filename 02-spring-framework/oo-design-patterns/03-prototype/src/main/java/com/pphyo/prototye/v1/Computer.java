package com.pphyo.prototye.v1;

public class Computer implements Cloneable {

	private String model;
	private int cpu;
	private int ram;
	private String color;
	private double price;
	
	@Override
	public Computer clone() throws CloneNotSupportedException {
		return (Computer) super.clone();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computer [model=" + model + ", cpu=" + cpu + ", ram=" + ram + ", color=" + color + ", price=" + price
				+ "]";
	}

}
