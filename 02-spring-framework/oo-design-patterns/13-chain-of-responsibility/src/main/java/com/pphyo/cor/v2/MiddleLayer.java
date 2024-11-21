package com.pphyo.cor.v2;

public class MiddleLayer extends Handler {
	
	@Override
	public void handle(int request) {
		if(request >= 20 && request < 40) {
			System.out.println("This is middle layer.");
		} else {
			if(null != this.next)
				this.next.handle(request);
		}
	}

}
