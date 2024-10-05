package com.pphyo.prototye.v2;

public abstract class Shape {

	protected int x;
	protected int y;
	protected String color;

	public Shape() {
	}

	public Shape(Shape source) {
		this.x = source.x;
		this.y = source.y;
		this.color = source.color;
	}

	public abstract Shape clone();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
