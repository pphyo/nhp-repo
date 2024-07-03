package com.pphyo.oop;

public class RideAndLoadApp {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a = b;

		var app = new RideAndLoadApp();
		app.overloading(b);
		a.perform();
		b.perform();
	}
	
	void overloading(A a) {
		System.out.println("A version");
	}
	
	void overloading(B b) {
		System.out.println("B version");
	}

}

class A {
	void perform() {
		System.out.println("A perform().");
	}
}

class B extends A {
	@Override
	void perform() {
		System.out.println("B perform().");
	}
}