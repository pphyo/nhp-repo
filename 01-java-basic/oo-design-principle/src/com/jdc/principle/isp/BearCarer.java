package com.jdc.principle.isp;

public class BearCarer implements BearCleaner, BearFeeder {

	@Override
	public void feedTheBear() {
		System.out.println("Bear carer feeds the bear.");
	}

	@Override
	public void washTheBear() {
		System.out.println("Bear carer pet the bear.");
	}

}
