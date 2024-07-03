package com.pphyo.oop;

import com.pphyo.oop.abst.InterfaceImpl;
import com.pphyo.oop.abst.InterfaceThree;

public interface InterfaceDemo {

	public static void main(String[] args) {
		
		InterfaceThree three = new InterfaceImpl();
		three.run();
		
	}

}
