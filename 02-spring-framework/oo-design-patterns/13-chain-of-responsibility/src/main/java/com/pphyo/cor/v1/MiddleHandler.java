package com.pphyo.cor.v1;

public class MiddleHandler implements Handler {
	
	private static final int MIDDLE_HANDLER = 2;
	private Handler handler;
	
	public MiddleHandler(Handler handler) {
		super();
		this.handler = handler;
	}

	@Override
	public void handle(int i) {
		if(i == MIDDLE_HANDLER) {
			System.out.println("This is middle handler.");
		} else {
			handler.handle(i);
		}
	}

}
