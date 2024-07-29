package com.jdc.stream;

import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationTest {

	public static void main(String[] args) {
		var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 9);
		
		var doubleAverage = list.stream().collect(Collectors.averagingDouble(i -> i.doubleValue()));
		System.out.println("Double average: " + doubleAverage);
		
		var intAverage = list.stream().collect(Collectors.averagingInt(i -> i.intValue()));
		System.out.println("Integer average: " + intAverage);
		
		var longAverage = list.stream().collect(Collectors.averagingLong(i -> i.longValue()));
		System.out.println("Long average: " + longAverage);
		
		var groupOne = list.stream().collect(Collectors.groupingBy(i -> i % 2 == 0));
		System.out.println(groupOne);
		
		var groupTwo = list.stream().collect(Collectors.groupingBy(i -> i % 2 == 0, Collectors.toSet()));
		System.out.println(groupTwo);
		
		var joinOne = list.stream().map(i -> i + "").collect(Collectors.joining());
		System.out.println(joinOne);
		
		var joinTwo = list.stream().map(i -> i + "").collect(Collectors.joining(", "));
		System.out.println(joinTwo);
		
		var joinThree = list.stream().map(i -> i + "").collect(Collectors.joining(", ", "Number: ", ""));
		System.out.println(joinThree);
		
		var partition = list.stream().collect(Collectors.partitioningBy(i -> i % 2 != 0));
		System.out.println(partition);
		
		var summingInt = list.stream().collect(Collectors.summingInt(i -> i.intValue()));
		System.out.println(summingInt);
		
		var summarizingInt = list.stream().collect(Collectors.summarizingInt(i -> i.intValue()));
		System.out.println(summarizingInt);
		
		var any = list.stream().anyMatch(i -> i > 50);
		System.out.println(any);
		
		var all = list.stream().allMatch(i -> i > 10);
		System.out.println(all);
		
		var none = list.stream().noneMatch(i -> i > 10);
		System.out.println(none);
		
		var firstInSeq = list.stream().findFirst();
		var anyInSeq = list.stream().findAny();
		System.out.println(firstInSeq);
		System.out.println(anyInSeq);
		
		var firstInPar = list.parallelStream().findFirst();
		var anyInPar = list.parallelStream().findAny();
		System.out.println(firstInPar);
		System.out.println(anyInPar);
//		var reduceResult = list.stream().reduce(10, (a, b) -> a + b);
//		System.out.println("Reduce: " + reduceResult);
//		
//		var collectResult = list.stream().collect(() -> 2, (a, b) -> System.out.println(a + b), (a, b) -> System.out.println(a + b));
//		System.out.println(collectResult);
	}
	
}
