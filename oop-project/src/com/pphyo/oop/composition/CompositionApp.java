package com.pphyo.oop.composition;

public class CompositionApp {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Nami");
		p.setCar(new Car("2007", 4));
		p.driveCar();

	}

}
