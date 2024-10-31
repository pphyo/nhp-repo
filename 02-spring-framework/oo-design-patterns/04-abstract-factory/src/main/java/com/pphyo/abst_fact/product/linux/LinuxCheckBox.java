package com.pphyo.abst_fact.product.linux;

import com.pphyo.abst_fact.product.CheckBox;

public class LinuxCheckBox extends CheckBox {
	
	@Override
	public void toggleCheck() {
		if(isCheck()) {
			System.out.println("Linux checkbox is unchecked.");
			setCheck(!isCheck());
		} else {
			System.out.println("Linux checkbox is checked.");
			setCheck(!isCheck());
		}
	}

}
