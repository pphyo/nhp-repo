package com.pphyo.cor.v2;

public class FrontEndLayer extends Handler {
	
	@Override
	public void handle(int request) {
		if(request < 20) {
			System.out.println("This is front end layer.");
		} else {
			if(null != this.next)
				this.next.handle(request);
		}
	}

}
