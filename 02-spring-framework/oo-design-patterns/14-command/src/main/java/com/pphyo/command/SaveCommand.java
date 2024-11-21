package com.pphyo.command;

public class SaveCommand implements Command {

	private TextEditor editor;

	public SaveCommand(TextEditor editor) {
		super();
		this.editor = editor;
	}

	@Override
	public void execute() {
		editor.save();
	}

}
