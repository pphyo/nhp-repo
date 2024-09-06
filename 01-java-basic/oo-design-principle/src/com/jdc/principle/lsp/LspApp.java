package com.jdc.principle.lsp;

public class LspApp {

	public static void main(String[] args) {
		EngineCar car = new MotorCar(new Engine());
		car.turnOnEngine();
		car.accelerate();
	}

}
