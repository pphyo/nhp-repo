package com.pphyo.state;

public class GreenState implements State {
	
	@Override
	public void doAction(Context context) {
		context.setState(this);		
	}
	
	@Override
	public String toString() {
		return "Green state";
	}

}
