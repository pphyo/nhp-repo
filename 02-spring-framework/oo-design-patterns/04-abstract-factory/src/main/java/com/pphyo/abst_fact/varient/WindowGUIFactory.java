package com.pphyo.abst_fact.varient;

import com.pphyo.abst_fact.factory.GUIFactory;
import com.pphyo.abst_fact.product.Button;
import com.pphyo.abst_fact.product.CheckBox;
import com.pphyo.abst_fact.product.ComboBox;
import com.pphyo.abst_fact.product.win.WindowButton;
import com.pphyo.abst_fact.product.win.WindowCheckBox;
import com.pphyo.abst_fact.product.win.WindowComboBox;

public class WindowGUIFactory implements GUIFactory {

	@Override
	public Button makeButton() {
		return new WindowButton();
	}

	@Override
	public CheckBox makeCheckBox() {
		return new WindowCheckBox();
	}
	
	@Override
	public ComboBox makeComboBox() {
		return new WindowComboBox();
	}

}
