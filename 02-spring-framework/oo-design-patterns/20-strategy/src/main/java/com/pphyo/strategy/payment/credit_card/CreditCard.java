package com.pphyo.strategy.payment.credit_card;

import com.pphyo.strategy.payment.PaymentStrategy;

public abstract class CreditCard implements PaymentStrategy {
	
	protected String cardNumber;
	protected String cvcNumber;
	protected String holderName;
	
	public CreditCard(String cardNumber, String cvcNumber, String holderName) {
		this.cardNumber = cardNumber;
		this.cvcNumber = cvcNumber;
		this.holderName = holderName;
	}

}
