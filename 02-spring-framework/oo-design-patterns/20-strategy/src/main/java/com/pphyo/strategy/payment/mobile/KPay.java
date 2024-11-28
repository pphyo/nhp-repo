package com.pphyo.strategy.payment.mobile;

public class KPay extends MobilePay {

	public KPay(String username, String phoneNumber) {
		super(username, phoneNumber);
	}

	@Override
	public void pay(int amount) {
		System.out.println("""
				%d amount is paid using KPay.
				Username: %s
				Phone No: %s""".formatted(amount, username, phoneNumber));
	}

}
