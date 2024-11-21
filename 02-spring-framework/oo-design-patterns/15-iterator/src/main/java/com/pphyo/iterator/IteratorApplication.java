package com.pphyo.iterator;

public class IteratorApplication {

	public static void main(String[] args) {
		
		var aggregator = new ConcreteAggregator(new Object[] {"Java", "Dart", "Javascript", "Python", "Kotlin"});
		Iterator iterator = aggregator.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
