package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CollectionExtra {
	
	@Test
	void test() {
		// do not allow all update operations because of immutable collection
		List<String> of = List.of("Isabela", "Adam", "Peter", "John", "William");

		// do not allow all update operations because of unmodifiable collection
		List<String> unmodifiableList = Collections.unmodifiableList(of);
		
		// do not allow add and remove operations but update operation is permitted 
		List<String> asList = Arrays.asList("Isabela", "Adam", "Peter", "John", "William");
		List<String> list = new ArrayList<>(asList);
		
		list.add("Bob");
		System.out.println("Array list: " + list);
		
		asList.set(1, "George");
		System.out.println("Array's asList: " + asList);
		
		asList.sort(null);
		System.out.println("Sorting list: " + asList);
		
		assertThrows(UnsupportedOperationException.class, () -> asList.add("David"));
		assertThrows(UnsupportedOperationException.class, () -> of.add("David"));
		assertThrows(UnsupportedOperationException.class, () -> unmodifiableList.add("David"));
		
	}

}
