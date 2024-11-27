package com.pphyo.mediator;

public class ComponentB implements Component {
	
	private Mediator mediator;
	
	public ComponentB(Mediator mediator) {
		this.mediator = mediator;
	}
	
	@Override
	public void send(String message) {
		System.out.println("Component B sending: " + message);
		mediator.notify(this, message);
	}

	@Override
	public void receive(String message) {
		System.out.println("Component B received: " + message);		
	}

}
