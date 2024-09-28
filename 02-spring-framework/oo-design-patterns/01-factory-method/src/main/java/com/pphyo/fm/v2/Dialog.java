package com.pphyo.fm.v2;

public abstract class Dialog {
	
	public void render() {
		var button = onClick();
		button.click();
	}
	
	public abstract Button onClick();

}
