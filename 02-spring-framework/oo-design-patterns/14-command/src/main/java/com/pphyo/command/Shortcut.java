package com.pphyo.command;

public class Shortcut {
	
	private Command command;

	public Shortcut(Command command) {
		super();
		this.command = command;
	}
	
	public void press() {
		command.execute();
	}

}
