package com.pphyo.strategy;

import com.pphyo.strategy.payment.mobile.AyaPay;

public class StrategyApplication {
	
	public static void main(String[] args) {
		var cart = new ShoppingCart();
		cart.buyAndPay(new AyaPay("pphyo", "092939333"), 20000);
	}

}
