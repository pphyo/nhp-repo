package com.jdc.generic.wildcards;

import java.util.List;

public class WildcardError {
	
	public void foo(List<?> list) {
		fooHelper(list);
	}
	
	private <T> void fooHelper(List<T> list) {
		list.set(0, list.get(0));
	}

}
