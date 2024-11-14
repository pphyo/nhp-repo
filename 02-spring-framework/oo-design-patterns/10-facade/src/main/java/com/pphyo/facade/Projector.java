package com.pphyo.facade;

public class Projector {
	
	public void on() {
		System.out.println("Projector is on.");
	}
	
	public void setInput(DvdPlayer dvdPlayer) {
		System.out.println("Setting DVD player to projector.");
	}
	
	public void display() {
		System.out.println("Projector is displaying.");
	}
	
	public void off() {
		System.out.println("Projector is off.");
	}

}
