package com.pphyo.command;

public class OpenCommand implements Command {
	
	private TextEditor editor;

	public OpenCommand(TextEditor editor) {
		super();
		this.editor = editor;
	}
	
	@Override
	public void execute() {
		this.editor.open();		
	}
}
