package com.pphyo.adapter;

public class SquarePegAdapter extends RoundPeg {
	
	private SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg) {
		super(peg.getWidth());
		this.peg = peg;
	}
	
	@Override
	public int getRadius() {
		return (int) (peg.getWidth() * Math.sqrt(2) / 2);
	}

}
