package com.jdc.optional;

import java.util.Optional;

public class Person {

	private Optional<Car> car = Optional.empty();

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}

}
