package com.jdc.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCards<T extends Number> {
	
	private List<T> list = new ArrayList<>();
	
	public T getFirstElement() {
		return list.getFirst();
	}

}
