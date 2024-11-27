package com.pphyo.mediator;

public class ConcreteMediator implements Mediator {

	private ComponentA componentA;
	private ComponentB componentB;

	public void setComponentA(ComponentA componentA) {
		this.componentA = componentA;
	}

	public void setComponentB(ComponentB componentB) {
		this.componentB = componentB;
	}

	@Override
	public void notify(Component component, String message) {
		if (component == componentA) {
			System.out.println("Mediator received message from A: " + message);
			componentB.receive(message);
		} else if (component == componentB) {
			System.out.println("Meidator received message from B: " + message);
			componentA.receive(message);
		}
	}

}
