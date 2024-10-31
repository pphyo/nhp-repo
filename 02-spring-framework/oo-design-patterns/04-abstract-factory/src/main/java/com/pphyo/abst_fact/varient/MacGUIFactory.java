package com.pphyo.abst_fact.varient;

import com.pphyo.abst_fact.factory.GUIFactory;
import com.pphyo.abst_fact.product.Button;
import com.pphyo.abst_fact.product.CheckBox;
import com.pphyo.abst_fact.product.ComboBox;
import com.pphyo.abst_fact.product.mac.MacButton;
import com.pphyo.abst_fact.product.mac.MacCheckBox;
import com.pphyo.abst_fact.product.mac.MacComboBox;

public class MacGUIFactory implements GUIFactory {

	@Override
	public Button makeButton() {
		return new MacButton();
	}

	@Override
	public CheckBox makeCheckBox() {
		return new MacCheckBox();
	}
	
	@Override
	public ComboBox makeComboBox() {
		return new MacComboBox();
	}

}
