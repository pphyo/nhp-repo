package com.jdc.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdc.generic.method.Util;
import com.jdc.generic.multi.AnotherPair;
import com.jdc.generic.multi.OrderPair;
import com.jdc.generic.multi.Pair;

public class GenericApp {

	public static void main(String[] args) {
		runForGenericType();
	}
	
	static void runForMultiType() {
		Pair<String, Integer> p1 = new OrderPair<>("Banana", 300);
		Pair<String, GenericBox<Integer>> p2 = new OrderPair<>("Orange", new GenericBox<>());
		
		Pair<String, Integer> p3 = new AnotherPair<>("Banana", 300);
		
		System.out.println(Util.compare(p1, p3));
		System.out.println("%s %s %s".formatted(p1, p2, p3));
	}
	
	static void runForGenericType() {
		GenericBox<Integer> iBox = new GenericBox<>();
		iBox.set(10);
		iBox.inspect(100L);
				
		RawBox rawBox = new RawBox();
		rawBox.set("Raw Box");
		Integer i = (Integer) rawBox.get(); // runtime error
		System.out.println(i);
	}
	
	static void runForTypeSafe() {
		List<String> sList = new ArrayList<>();
		sList.add("Kakashi");
		sList.add("Naruto");
		
		for(String s : sList) {
			System.out.println(s);	
		}
		
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	static void runForRaw() {
		List rawList = new ArrayList();
		rawList.add(10);
		rawList.add("Hello Generic");
		rawList.add(new Date());
		
		Integer iVal = (Integer) rawList.get(0);
		String sVal = (String) rawList.get(1);
		Date dVal = (Date) rawList.get(2);
		
		System.out.println(iVal);
		System.out.println(sVal);
		System.out.println(dVal);
	}

}
