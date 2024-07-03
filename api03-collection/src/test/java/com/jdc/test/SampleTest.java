package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SampleTest {

	@Test
	void test() {
		assertEquals(30, add(10, 20));
		
		assertTrue(isEven(20));
		assertFalse(isEven(11));
	}
	
	boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
}
