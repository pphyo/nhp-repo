package com.pphyo.abst_fact.product.win;

import com.pphyo.abst_fact.product.CheckBox;

public class WindowCheckBox extends CheckBox {

	@Override
	public void toggleCheck() {
		if(isCheck()) {
			System.out.println("Window checkbox is unchecked.");
			setCheck(!isCheck());
		} else {
			System.out.println("Window checkbox is checked.");
			setCheck(!isCheck());
		}
	}

}
