package com.pphyo.prototye.v2;

public class PrototypeV2App {
	
	public static void main(String[] args) {
		var rect = new Rectangle();
		rect.setX(15);
		rect.setY(10);
		rect.setWidth(20);
		rect.setHeight(13);
		rect.setColor("Red");
		
		var cir = new Circle();
		cir.setX(30);
		cir.setY(40);
		cir.setRadius(21);
		cir.setColor("Green");
		
		System.out.println(rect);
		System.out.println(cir);
		
		var rectCopy = rect.clone();
		var cirCopy = cir.clone();
		
		System.out.println(rectCopy);
		System.out.println(cirCopy);
		
	}

}
