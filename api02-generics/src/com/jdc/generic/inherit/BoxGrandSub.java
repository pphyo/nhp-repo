package com.jdc.generic.inherit;

public class BoxGrandSub<T> extends BoxSubWithGeneric<T> {
	
	@Override
	public String toString() {
		return "%s".formatted(get());
	}
	
}
