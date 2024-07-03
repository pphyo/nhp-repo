package com.jdc.generic.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildCardsApp {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4 , 5, 6);
		
		List<Long> longList = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L);
		
		List<Double> douList = Arrays.asList(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
		
		System.out.println(sumOfList(intList));
		System.out.println(sumOfList(longList));
		System.out.println(sumOfList(douList));
		
		printObjectList(longList);

	}
	
	static void printLowerList(List<? super B> list) {
		list.add(new B());
	}
	
	static void printObjectList(List<?> list) {
//		list.add(100L);
		for (Object ele : list) {
			System.out.print(ele + " ");		
		}
		System.out.println();
	}
	
	static long sumOfList(List<? extends Number> list) {
		long result = 0L;
		
		for(Number n : list) {
			result += n.longValue();
		}
		
		return result;
	}

}

class A {}
class B extends A {}
class C extends B {}
