package com.pphyo.fm.v1;

import com.pphyo.fm.v1.factory.StudentFactory;

public class FactoryMethodV1App {

	public static void main(String[] args) {
		
		var stuWithName = StudentFactory.withName("Hla Hla");
		System.out.println(stuWithName.getName());

	}

}
