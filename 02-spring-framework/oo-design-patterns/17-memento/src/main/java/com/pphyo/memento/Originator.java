package com.pphyo.memento;

public class Originator {
	
	private String state;
	
	public void setState(String state) {
		System.out.println("Setting state to: " + state);
		this.state = state;
	}
	
	public Memento saveToMemento() {
		System.out.println("Saving to Memento.");
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento memento) {
		this.state = memento.getState();
		System.out.println("Restored state from Memento: " + state);
	}

}
