package com.pphyo.iterator;

public class ConcreteAggregator implements Aggregator {
	
	private Object[] items;
	
	public ConcreteAggregator(Object[] items) {
		this.items = items;
	}
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int size() {
		return items.length;
	}
	
	public Object get(int index) {
		return items[index];
	}

}
