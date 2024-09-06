package com.pphyo.j21.boxing;

import static com.pphyo.j21.boxing.AppUtil.*;

public class BoxingDemo {

	public static void main(String[] args) {
		
		System.out.println(COUNTER);
		System.out.println(add(10, 20));
		
	}
	
	@SuppressWarnings("removal")
	static void runForBoxing() {
		Byte helperByte = 10;
		int priInt = 20;
		Integer helperInt = new Integer(200);
		
		priInt = helperInt.intValue(); // unboxing
		
		helperInt = Integer.valueOf(priInt); // boxing
		
		priInt = helperByte.byteValue();
	}

}
