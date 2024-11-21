package com.pphyo.cor.v2;

public abstract class Handler {
	
	protected Handler next;
	
	public void setNext(Handler next) {
		this.next = next;
	}
	
	public abstract void handle(int request);
	
}
