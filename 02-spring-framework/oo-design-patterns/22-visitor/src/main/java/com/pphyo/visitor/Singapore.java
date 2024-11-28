package com.pphyo.visitor;

public class Singapore implements Visitable {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}

}
