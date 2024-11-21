package com.pphyo.mediator;

public class ComponentB implements Component {
	
	private Mediator mediator;
	
	public ComponentB(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void doOperation() {
		mediator.notify(this, "Component B operation.");
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		
	}

}
