package com.pphyo.adapter;

public class AdapterApplication {
	
	public static void main(String[] args) {
		
		var hole = new RoundHole(5);
		var rPeg = new RoundPeg(5);
		hole.fit(rPeg);
		
		var smallSquarePeg = new SquarePeg(5);
		var largeSquarePeg = new SquarePeg(10);
		
		var smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
		var largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
		
		var smallResult = hole.fit(smallSquarePegAdapter);
		var largeResult = hole.fit(largeSquarePegAdapter);
		output(smallResult);
		output(largeResult);
	}
	
	static void output(boolean fit) {
		System.out.println("Square peg %s fit in round hole.".formatted(fit ? "is" : "is not"));
	}

}
