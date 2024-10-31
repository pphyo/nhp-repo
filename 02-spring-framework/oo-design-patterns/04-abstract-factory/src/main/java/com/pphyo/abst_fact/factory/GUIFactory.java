package com.pphyo.abst_fact.factory;

import com.pphyo.abst_fact.product.Button;
import com.pphyo.abst_fact.product.CheckBox;
import com.pphyo.abst_fact.product.ComboBox;

public interface GUIFactory {
	
	Button makeButton();
	CheckBox makeCheckBox();
	ComboBox makeComboBox();

}
