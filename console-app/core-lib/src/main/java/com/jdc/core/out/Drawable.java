package com.jdc.core.out;

public interface Drawable {
	
	void draw();
	
	default void drawLine(int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
