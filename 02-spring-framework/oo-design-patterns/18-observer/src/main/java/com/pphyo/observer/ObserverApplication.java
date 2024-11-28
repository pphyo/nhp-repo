package com.pphyo.observer;

public class ObserverApplication {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("First state change: 10");
		subject.setState(10);
		
		subject.setState(5);
		
		
	}

}
