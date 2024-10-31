package com.pphyo.abst_fact.product.win;

import com.pphyo.abst_fact.product.Button;

public class WindowButton implements Button {
	
	@Override
	public void click() {
		System.out.println("Window button clicks.");		
	}

}
