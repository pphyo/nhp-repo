package com.pphyo.prototye.v2;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle() {
	}

	private Rectangle(Rectangle source) {
		super(source);
		this.width = source.width;
		this.height = source.height;
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + ", color=" + color + "]";
	}

}
