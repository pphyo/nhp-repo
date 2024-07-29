package com.jdc.optional;

import java.util.Optional;

public class OptionalApp {

	public static void main(String[] args) {
		Person person = new Person();
		Car car = new Car();
		Insurance insurance = new Insurance();
		insurance.setName("My car insurance");
		
		person.setCar(Optional.ofNullable(car));
//		car.setInsurance(Optional.ofNullable(insurance));
		
		System.out.println(getInsuranceName(Optional.ofNullable(person)));

	}

	static String getInsuranceName(Optional<Person> person) {
		return person.map(p -> p.getCar())
					.map(optCar -> optCar.orElse(new Car()).getInsurance())
					.map(optInsurance -> optInsurance.orElseGet(() -> {
						var insu = new Insurance();
						insu.setName("Unknown");
						return insu;
					})).get().getName();
	}
	
}
