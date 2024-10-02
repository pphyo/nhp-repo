package com.jdc.app;

public record Addition() implements CanAdd {

	@Override
	public int add(int a, int b) {
		return 0;
	}

}
