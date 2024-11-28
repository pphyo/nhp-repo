package com.pphyo.strategy.payment.credit_card;

public class VisaCard extends CreditCard {
	
	public VisaCard(String cardNumber, String cvcNumber, String holderName) {
		super(cardNumber, cvcNumber, holderName);
	}

	@Override
	public void pay(int amount) {
		System.out.println("""
				%d is paid using Visa Card.
				Holder name: %s
				Card number: %s""".formatted(amount, holderName, cardNumber));
	}

}
