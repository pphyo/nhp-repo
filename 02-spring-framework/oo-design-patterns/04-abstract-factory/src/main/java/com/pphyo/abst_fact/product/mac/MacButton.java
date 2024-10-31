package com.pphyo.abst_fact.product.mac;

import com.pphyo.abst_fact.product.Button;

public class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("Mac button clicks.");
	}

}
