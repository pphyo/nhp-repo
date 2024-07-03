package com.pphyo.oop.abst;

public interface InterfaceThree extends InterfaceOne, InterfaceTwo {

	@Override
	default void doGet() {
		InterfaceOne.super.doGet();
	}

}
