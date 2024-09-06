package com.jdc.principle.lsp;

public class Engine {
	
	public void on() {
		System.out.println("Engine is on.");
	}
	
	public void accelerate(int horsePower) {
		System.out.println("Engine is accelerating with %d hp.".formatted(horsePower));
	}

}
