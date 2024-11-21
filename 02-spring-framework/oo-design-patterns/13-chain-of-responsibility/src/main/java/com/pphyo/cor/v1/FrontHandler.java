package com.pphyo.cor.v1;

public class FrontHandler implements Handler {
	
	private static final int FRONT_HANDLER = 1;
	private Handler handler;

	public FrontHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handle(int i) {
		if(i == FRONT_HANDLER) {
			System.out.println("This is front handler.");
		} else {
			handler.handle(i);
		}
		
	}
	
}
