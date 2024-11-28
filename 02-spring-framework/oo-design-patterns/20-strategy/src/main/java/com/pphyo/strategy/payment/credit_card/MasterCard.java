package com.pphyo.strategy.payment.credit_card;

public class MasterCard extends CreditCard {
	
	public MasterCard(String cardNumber, String cvcNumber, String holderName) {
		super(cardNumber, cvcNumber, holderName);
	}

	@Override
	public void pay(int amount) {
		System.out.println("""
				%d is paid using Master Card.
				Holder name: %s
				Card number: %s""".formatted(amount, holderName, cardNumber));
	}
	
}
