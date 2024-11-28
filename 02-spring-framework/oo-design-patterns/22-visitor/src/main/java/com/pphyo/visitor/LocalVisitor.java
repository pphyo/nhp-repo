package com.pphyo.visitor;

public class LocalVisitor implements Visitor {
	
	@Override
	public void visit(Visitable visitable) {
		System.out.println(getClass().getSimpleName() + " vists " + visitable.getClass().getSimpleName());		
	}

}