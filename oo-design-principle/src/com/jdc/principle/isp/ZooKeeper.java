package com.jdc.principle.isp;

public class ZooKeeper implements BearKeeper {

	@Override
	public void washTheBear() {
		System.out.println("Zoo keeper washes the bear.");
	}

	@Override
	public void feedTheBear() {
		System.out.println("Zoo keeper feeds the bear.");
	}

	@Override
	public void petTheBear() {
		System.out.println("Zoo keeper pet the bear.");
	}

}
