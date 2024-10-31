package com.pphyo.abst_fact.varient;

import com.pphyo.abst_fact.factory.GUIFactory;
import com.pphyo.abst_fact.product.Button;
import com.pphyo.abst_fact.product.CheckBox;
import com.pphyo.abst_fact.product.ComboBox;
import com.pphyo.abst_fact.product.linux.LinuxButton;
import com.pphyo.abst_fact.product.linux.LinuxCheckBox;
import com.pphyo.abst_fact.product.linux.LinuxComboBox;

public class LinuxGUIFactory implements GUIFactory {

	@Override
	public Button makeButton() {
		return new LinuxButton();
	}

	@Override
	public CheckBox makeCheckBox() {
		return new LinuxCheckBox();
	}

	@Override
	public ComboBox makeComboBox() {
		return new LinuxComboBox();
	}

}
