package com.pphyo.state;

public class RedState implements State {
	
	@Override
	public void doAction(Context context) {
		context.setState(this);		
	}
	
	@Override
	public String toString() {
		return "Red state";
	}

}
