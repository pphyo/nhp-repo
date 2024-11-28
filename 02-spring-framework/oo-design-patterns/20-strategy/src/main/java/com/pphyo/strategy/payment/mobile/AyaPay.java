package com.pphyo.strategy.payment.mobile;

public class AyaPay extends MobilePay {

	public AyaPay(String username, String phoneNumber) {
		super(username, phoneNumber);
	}

	@Override
	public void pay(int amount) {
		System.out.println("""
				%d amount is paid using AYA Pay.
				Username: %s
				Phone No: %s""".formatted(amount, username, phoneNumber));
	}
}
