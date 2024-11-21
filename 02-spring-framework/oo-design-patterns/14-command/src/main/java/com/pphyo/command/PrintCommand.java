package com.pphyo.command;

public class PrintCommand implements Command {
	
	private TextEditor editor;

	public PrintCommand(TextEditor editor) {
		super();
		this.editor = editor;
	}
	
	@Override
	public void execute() {
		this.editor.print();		
	}

}
