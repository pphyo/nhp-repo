package com.pphyo.command;

public class CommandApplication {
	
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		
		Command save = new SaveCommand(editor);
		Command open = new OpenCommand(editor);
		Command print = new PrintCommand(editor);
		
		Button saveButton = new Button(save);
		Button openButton = new Button(open);
		Shortcut saveShortcut = new Shortcut(save);
		Shortcut printShortcut = new Shortcut(print);
		
		saveButton.click();
		openButton.click();
		saveShortcut.press();
		printShortcut.press();
		
	}

}
