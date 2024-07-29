package com.jdc.func;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterUsecase {

	public static void main(String[] args) {

		runForFunction();
	}
	
	static void runForFunction() {
		Function<String, Integer> strToInt = str -> Integer.parseInt(str);
		System.out.println(strToInt.apply("20"));
		
		Function<String, String> strToStr = str -> "Hello! ".concat(str);
		System.out.println(strToStr.apply("U Tun"));
		
		Function<Integer, Integer> twice = num -> num * 2;
		Function<Integer, Integer> square = num -> num * num;
		
		System.out.println(twice.andThen(twice).andThen(square).apply(2));
		System.out.println(twice.compose(twice).compose(square).apply(2));
		
		var result = square.compose(square).andThen(twice).compose(twice).apply(2);
		System.out.println(result);
	}
	
	static void runForSupplier() {
		Person person = new Person();
		person.setName("U Tun");
		person.setAge(43);
		
		Supplier<String> strSup = person::getName;
		Supplier<Integer> intSup = person::getAge;
		System.out.println(strSup.get());
		System.out.println(intSup.get());
	}
	
	static void runForPredicate() {
		Predicate<String> isStartMg = str -> str.startsWith("Mg");
		Predicate<String> isStartKo = str -> str.startsWith("Ko");
		Predicate<String> isStartU = str -> str.startsWith("U");
		
		Predicate<Integer> pred2 = i -> i % 2 == 0;
		
		System.out.println(isStartMg.or(isStartKo).or(isStartU).test("Daw Tun") ? "Male" : "Female");
		System.out.println(pred2.test(10));
	}

	static void runForConsumer() {
		Consumer<String> con1 = System.out::println;
//		con1.accept("Hello consumer");
		
		Consumer<String> con2 = data -> System.out.println("Hello %s".formatted(data));
//		con2.accept("Java");
		
		con1.andThen(con2).andThen(con1).accept("Java");
		
	}

}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}