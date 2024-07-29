package com.jdc.func;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalCalculator {
	
	public static void main(String[] args) {
		new FunctionalCalculator().run();
	}
	
	void run() {
		Function<Sign, BiFunction<Double, Double, Double>> calFun = this::calculate;
		var biFun = calFun.apply(Sign.MINUS);
		var result = biFun.apply(10.0, 20.0);
		System.out.println("Result: " + result);
		
		System.out.println(calFun.apply(Sign.TIMES).apply(5.0, 4.2));
	}
	
	BiFunction<Double, Double, Double> calculate(Sign sign) {
		return switch(sign) {
		case PLUS -> (a, b) -> a + b;
		case MINUS -> (a, b) -> a - b;
		case TIMES -> (a, b) -> a * b;
		case DIVIDE -> (a, b) -> a / b;
		default -> throw new IllegalArgumentException("Error!");
		};
	}
	
	public enum Sign {
		PLUS, MINUS, TIMES, DIVIDE
	}

}
