package com.pphyo.iterator;

public class ConcreteIterator implements Iterator {
	
	private ConcreteAggregator aggregator;
	private int currentIndex = 0;
	
	public ConcreteIterator(ConcreteAggregator aggregator) {
		this.aggregator = aggregator;
	}
	
	@Override
	public boolean hasNext() {
		return currentIndex < aggregator.size();
	}
	
	@Override
	public Object next() {
		return aggregator.get(currentIndex ++);
	}

}
