package com.pphyo.mediator;

public class ComponentA implements Component {
	
	private Mediator mediator;
	
	public ComponentA(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		System.out.println("Component A sending: " + message);
		mediator.notify(this, message);
	}

	@Override
	public void receive(String message) {
		System.out.println("Component A received: " + message);		
	}
	
	
}
