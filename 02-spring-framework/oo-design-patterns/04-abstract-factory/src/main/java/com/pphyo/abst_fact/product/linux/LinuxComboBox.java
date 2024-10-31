package com.pphyo.abst_fact.product.linux;

import com.pphyo.abst_fact.product.ComboBox;

public class LinuxComboBox implements ComboBox {
	
	@Override
	public void select(String data) {
		System.out.println("%s is select in Linux Combo Box.".formatted(data));
	}

}
