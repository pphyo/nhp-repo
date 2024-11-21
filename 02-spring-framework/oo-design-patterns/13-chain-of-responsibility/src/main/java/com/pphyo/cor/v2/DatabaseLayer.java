package com.pphyo.cor.v2;

public class DatabaseLayer extends Handler {
	
	@Override
	public void handle(int request) {
		if(request >= 60) {
			System.out.println("This is database layer.");
		} else {
			if(null != this.next)
				this.next.handle(request);
		}
	}

}
