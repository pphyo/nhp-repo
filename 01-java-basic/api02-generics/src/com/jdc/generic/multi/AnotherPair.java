package com.jdc.generic.multi;

public class AnotherPair<V> implements Pair<String, V> {
	
	private String key;
	private V value;
	
	public AnotherPair(String key, V value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
}
