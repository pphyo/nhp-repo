package com.pphyo.abst_fact.product.mac;

import com.pphyo.abst_fact.product.ComboBox;

public class MacComboBox implements ComboBox {
	
	@Override
	public void select(String data) {
		System.out.println("%s is select in Mac Combo Box.".formatted(data));
	}

}
