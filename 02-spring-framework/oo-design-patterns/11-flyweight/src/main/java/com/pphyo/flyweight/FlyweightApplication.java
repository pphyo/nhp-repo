package com.pphyo.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FlyweightApplication {
	
	private static final List<String> colors = new ArrayList<>();
	
	static {
		Collections.addAll(colors, "Red", "Green", "Blue", "White", "Black");
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 30; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomNumber());
			circle.setY(getRandomNumber());
			circle.setRadius(80);
			circle.draw();
		}
	}
	
	private static int getRandomNumber() {
		var ran = new Random();
		return ran.nextInt(1, 100);
	}
	
	private static String getRandomColor() {
		var list = new ArrayList<>(colors);
		Collections.shuffle(list);
		return list.get(0);
	}

}
