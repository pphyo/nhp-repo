package com.jdc.generic.bound;

@SuppressWarnings("all")
public class NaturalNumber<T extends Integer> {

	private T number;

	public NaturalNumber(T number) {
		this.number = number;
	}

	public boolean isEven() {
		return number % 2 == 0;
	}

}
