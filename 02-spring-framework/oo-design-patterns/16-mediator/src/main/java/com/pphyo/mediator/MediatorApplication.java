package com.pphyo.mediator;

public class MediatorApplication {

	public static void main(String[] args) {
		
		ConcreteMediator mediator = new ConcreteMediator();
		
		ComponentA ca = new ComponentA(mediator);
		ComponentB cb = new ComponentB(mediator);
		
		mediator.setComponentA(ca);
		mediator.setComponentB(cb);
		
		ca.send("Hello from A");
		cb.send("Hello from B");
		
		
	}
	
}
