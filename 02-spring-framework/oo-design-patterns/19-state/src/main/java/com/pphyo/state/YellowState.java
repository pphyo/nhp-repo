package com.pphyo.state;

public class YellowState implements State {
	
	@Override
	public void doAction(Context context) {
		context.setState(this);		
	}
	
	@Override
	public String toString() {
		return "Yellow state";
	}

}
