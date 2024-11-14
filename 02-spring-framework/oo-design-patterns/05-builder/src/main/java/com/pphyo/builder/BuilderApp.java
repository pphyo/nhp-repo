package com.pphyo.builder;

import com.pphyo.builder.car.CarBuilder;

public class BuilderApp {

	public static void main(String[] args) {
		
		var car = new CarBuilder()
					.addHorsePower(300)
					.addColor("Black")
					.addModel("Audi")
					.build();
		
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getHorsePower());
		System.out.println(car.getFuelType());
		
	}

}
