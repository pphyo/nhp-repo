package com.pphyo.command;

public class Button {
	
	private Command command;

	public Button(Command command) {
		super();
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}

}
