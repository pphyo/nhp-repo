package com.jdc.principle.lsp;

public class MotorCar implements EngineCar {
	
	private Engine engine;
	
	public MotorCar(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void turnOnEngine() {
		engine.on();
	}

	@Override
	public void accelerate() {
		engine.accelerate(400);
	}

}
