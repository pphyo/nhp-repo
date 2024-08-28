package com.jdc.datetime;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 5;
		int result = getFactorial(num);
		
		System.out.println("Factoril number of %d is %d.".formatted(num, result));
	}
	
	static int getFactorial(int num) {
		if(num > 1) {
			int factorial = getFactorial(num - 1);
			return num * factorial;
		}
		
		return num;
	}

}

// 5
// 5 * 4 * 3 * 2 * 1
// 120