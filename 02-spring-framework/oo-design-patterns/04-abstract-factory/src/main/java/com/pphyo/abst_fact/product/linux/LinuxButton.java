package com.pphyo.abst_fact.product.linux;

import com.pphyo.abst_fact.product.Button;

public class LinuxButton implements Button {
	
	@Override
	public void click() {
		System.out.println("Linux button clicks.");		
	}

}
