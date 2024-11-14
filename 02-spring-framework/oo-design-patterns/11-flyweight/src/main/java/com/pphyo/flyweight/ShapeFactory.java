package com.pphyo.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	private static final Map<String, Shape> map = new HashMap<>();
	
	public static Shape getCircle(String color) {
		Circle circle = (Circle) map.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("Creating circle with color: " + color);
		}
		
		return circle;
	}

}
