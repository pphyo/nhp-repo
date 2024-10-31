package com.pphyo.abst_fact;

import com.pphyo.abst_fact.factory.GUIFactory;
import com.pphyo.abst_fact.varient.LinuxGUIFactory;

public class AbstractFactoryApp {

	public static void main(String[] args) {

		GUIFactory factory = new LinuxGUIFactory();
		
		var button = factory.makeButton();
		button.click();
		
		var checkbox = factory.makeCheckBox();
		checkbox.toggleCheck();
		checkbox.toggleCheck();
		
		var comboBox = factory.makeComboBox();
		comboBox.select("Myanmar");
		
	}

}
