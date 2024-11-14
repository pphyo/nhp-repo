package com.pphyo.adapter;

public class RoundHole {
	
	private int radius;

	public RoundHole(int radius) {
		super();
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public boolean fit(RoundPeg peg) {
		return radius >= peg.getRadius();
	}

}
