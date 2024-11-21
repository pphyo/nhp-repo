package com.pphyo.mediator;

public class ComponentA implements Component {
	
	private Mediator mediator;
	
	public ComponentA(Mediator mediator) {
		this.mediator = mediator;
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
