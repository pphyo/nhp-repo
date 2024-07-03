package com.pphyo.oop.abst;

public class InterfaceImpl implements Greetable {

	@Override
	public void greet() {}
	
	@Override
	public void run() {
		System.out.println("run().");
	}

	@Override
	public void exit() {
		System.out.println("exit()");
	}

}
