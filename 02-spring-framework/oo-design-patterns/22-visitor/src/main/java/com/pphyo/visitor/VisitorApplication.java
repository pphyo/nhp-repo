package com.pphyo.visitor;

public class VisitorApplication {
	
	public static void main(String[] args) {
		
		var visitable = new Bangkok();
		var visitor = new LocalVisitor();
		visitable.accept(visitor);
		
	}

}
