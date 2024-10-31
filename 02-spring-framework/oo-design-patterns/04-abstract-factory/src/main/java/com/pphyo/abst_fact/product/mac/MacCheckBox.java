package com.pphyo.abst_fact.product.mac;

import com.pphyo.abst_fact.product.CheckBox;

public class MacCheckBox extends CheckBox {

	@Override
	public void toggleCheck() {
		if(isCheck()) {
			System.out.println("Mac checkbox is unchecked.");
			setCheck(!isCheck());
		} else {
			System.out.println("Mac checkbox is checked.");
			setCheck(!isCheck());
		}
	}

}
