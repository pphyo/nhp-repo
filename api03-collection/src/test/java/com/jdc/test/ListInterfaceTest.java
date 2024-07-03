package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// JUnit
// Hamcrest
// Mockito

public class ListInterfaceTest {
	
	@Test
	void test_for_linked_list() {
		var ll = new LinkedList<Integer>();
		Collections.addAll(ll, 1, 3, 5, 7, 9, 8, 6, 4, 2, 0);
		
		// peek, poll, remove
		assertEquals(1, ll.poll());
		
		// add, offer,
		
		System.out.println(ll);
		
	}
	
	@Test
	@Disabled
	void test_for_array_list() {
		var al = new ArrayList<Integer>();
		Collections.addAll(al, 1, 3, 5, 7, 9, 8, 6, 4, 2, 0);
		
		assertEquals(10, al.size());
		assertFalse(al.isEmpty());
		
		al.add(4);
		al.add(5, 20);
		assertEquals(12, al.size());
		
		assertEquals(1, al.get(0));
		assertEquals(20, al.get(5));
		
		assertEquals(5, al.set(2, 15));
		assertEquals(15, al.get(2));
		
		assertEquals(8, al.indexOf(4));
		assertEquals(al.size() - 1, al.lastIndexOf(4));
		
		assertEquals(1, al.remove(0));
		assertEquals(11, al.size());
		
		assertEquals(true, al.remove(Integer.valueOf(20)));
		assertEquals(false, al.remove(Integer.valueOf(25)));
		
		System.out.println(al);
		
	}

}
