package com.pphyo.cor.v2;

public class BackEndLayer extends Handler {
	
	@Override
	public void handle(int request) {
		if(request >= 40 && request < 60) {
			System.out.println("This is back end layer.");
		} else {
			if(null != this.next)
				this.next.handle(request);
		}
	}

}
