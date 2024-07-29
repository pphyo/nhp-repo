package com.jdc.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.jdc.stream.Person.Gender;

public class StreamApiApplication {
	
	public static void main(String[] args) {
		// array, collection, file, stream
		int[] array = {10, 8, 6, 4, 2, 1, 3, 5, 7, 9};
		
		executeArray(array, 1, 3);

		System.out.println();
		
		var intStream = Arrays.stream(array); // stream creation
		intStream.filter(i -> i > 5) // intermediate operation
			.skip(1)
			.limit(3)
			.sorted()
			.forEach(System.out::println); // terminal operation
		
		System.out.println();
//		intStream.boxed().map(i -> String.valueOf(i)).forEach(System.out::println);
		
		var list = List.of(
				"U Kaung Kyaw, 46, Male",
				"Daw Win Win Khaing, 51, Female",
				"Ma Hla Thinzar, 23, Female",
				"Ko Sai Thiha, 32, Male",
				"Mg Pyae Sone Htun, 15, Male"
				);
		
		list.stream()
			.map(Person::new)
			.filter(p -> p.getGender().equals(Gender.Male))
			.sorted()
			.forEach(System.out::println);
		System.out.println();
//		var pList = list.stream().map(Person::new).toList();
//		showPerson(pList, p -> p.getAge() > 30);
		
		List<List<Integer>> listOfList = List.of(
					List.of(6, 8, 4),
					List.of(5, 9, 7),
					List.of(1, 2, 3)
				);

		listOfList.parallelStream()
				  .flatMap(lol -> lol.stream().map(i -> i))
//				  .sorted()
//				  .dropWhile(i -> i % 2 != 0)
				  .forEachOrdered(System.out::println);
		
	}
	
	static void showPerson(List<Person> list, Predicate<Person> pred) {
		for(Person p : list) {
			if(pred.test(p)) {
				System.out.println(p);
			}
		}
	}
	
	static void executeArray(int[] array, long skip, long limit) {
		var greaterThanFive = new int[0];
		for(int i = 0, l = array.length; i < l; i ++) {
			if(array[i] > 5) {
				greaterThanFive = Arrays.copyOf(greaterThanFive, greaterThanFive.length + 1);
				greaterThanFive[greaterThanFive.length - 1] = array[i];
			}
		}
		
		var skipArray = new int[0];
		for(int i = 0, l = greaterThanFive.length; i < l; i ++) {
			if(i == skip - 1) {
				continue;
			} else {
				skipArray = Arrays.copyOf(skipArray, skipArray.length + 1);
				skipArray[skipArray.length - 1] = greaterThanFive[i];
			}
		}
		
		for(int i = 0; i < limit; i ++) {
			System.out.println(skipArray[i]);
		}
		
		
	}

}
