package com.pphyo.strategy;

import com.pphyo.strategy.payment.PaymentStrategy;

public class ShoppingCart {
	
	public void buyAndPay(PaymentStrategy strategy, int amount) {
		strategy.pay(amount);
	}

}
