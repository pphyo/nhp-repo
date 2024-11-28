package com.pphyo.state;

public class StateApplication {
	
	public static void main(String[] args) {
		
		Context context = new Context();
		
		RedState red = new RedState();
		red.doAction(context);
		
		GreenState green = new GreenState();
		green.doAction(context);
		
		YellowState yellow = new YellowState();
		yellow.doAction(context);
		
		System.out.println("Current state: " + context.getState());
		
	}

}
