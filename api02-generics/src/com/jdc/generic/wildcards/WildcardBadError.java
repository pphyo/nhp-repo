package com.jdc.generic.wildcards;

import java.util.List;

public class WildcardBadError {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		swapFirst(List.of("Hello"), String.class);
	}
	
	public static <E> void swapFirst(List<E> list, Class<E> cls) throws InstantiationException, IllegalAccessException {
//		E e = new E();
//		E e = cls.newInstance();
	}

}
