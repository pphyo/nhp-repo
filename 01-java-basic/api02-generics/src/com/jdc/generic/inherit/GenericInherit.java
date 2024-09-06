package com.jdc.generic.inherit;

import java.util.ArrayList;
import java.util.List;

public class GenericInherit {

	public static void main(String[] args) {
		
//		BoxSubWithGeneric<Number> numBoxSub = new BoxSubWithGeneric<>();
//		BoxSubWithGeneric<Integer> intBoxSub = new BoxSubWithGeneric<>();
//		BoxGrandSub<Integer> grandSub = new BoxGrandSub<>();
//		
//		BoxSuper boxSuper = numBoxSub;
//		boxSuper = grandSub;
//		
//		numBoxSub.set(10f);
		
		runForInfer();

	}
	
	static void runForInfer() {
		List<BoxGrandSub<Integer>> boxList = new ArrayList<>();
		GenericInherit.<Integer>addBox(100, boxList);
		addBox(200, boxList);
		addBox(300,boxList);
		
		outputBoxes(boxList);
	}
	
	static <U> void addBox(U u, List<BoxGrandSub<U>> boxes) {
		BoxGrandSub<U> box = new BoxGrandSub<>();
		box.set(u);
		boxes.add(box);
	}
	
	static <U> void outputBoxes(List<BoxGrandSub<U>> boxes) {
		for(int i = 0; i < boxes.size(); i ++) {
			System.out.println("Box #%d contains [%s]".formatted(i, boxes.get(i).get()));
		}
	}
	
	static class OtherData {}
	
	static void launch() {
		var s = pick("first", 10);
		System.out.println(s);
	}
	
	static <T> T pick(T t1, T t2) {
		return t2;
	}
	

}
