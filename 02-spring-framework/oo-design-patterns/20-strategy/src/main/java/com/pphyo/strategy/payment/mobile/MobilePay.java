package com.pphyo.strategy.payment.mobile;

import com.pphyo.strategy.payment.PaymentStrategy;

public abstract class MobilePay implements PaymentStrategy {
	
	protected String username;
	protected String phoneNumber;
	
	public MobilePay(String username, String phoneNumber) {
		this.username = username;
		this.phoneNumber = phoneNumber;
	}

}
