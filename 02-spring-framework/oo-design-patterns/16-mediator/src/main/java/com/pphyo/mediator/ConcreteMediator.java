package com.pphyo.mediator;

public class ConcreteMediator implements Mediator {

	private ComponentA componentA;
	private ComponentB componentB;

	public ConcreteMediator(ComponentA componentA, ComponentB componentB) {
		super();
		this.componentA = componentA;
		this.componentB = componentB;
	}
	
	@Override
	public void notify(Component component, String message) {
		if(component instanceof ComponentA) {
			
		} else if(component instanceof ComponentB) {
			componentB.doOperation();
		}
	}

}
