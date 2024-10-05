package com.pphyo.prototye.v2;

public class Circle extends Shape {

	private int radius;

	public Circle() {
	}

	private Circle(Circle source) {
		super(source);
		this.radius = source.radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + ", color=" + color + "]";
	}

}
