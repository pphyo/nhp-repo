package com.jdc.principle.isp;

public class IspApp {

	public static void main(String[] args) {
		BearKeeper keeper = new ZooKeeper();
		keeper.washTheBear();
		keeper.feedTheBear();
		keeper.petTheBear();

		BearCarer carer = new BearCarer();
		carer.feedTheBear();
		carer.washTheBear();
	}

}
