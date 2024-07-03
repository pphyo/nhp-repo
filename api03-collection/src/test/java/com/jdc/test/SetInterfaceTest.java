package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SetInterfaceTest {
	
	static Set<Integer> set = Set.of(1, 3, 5, 7, 9, 8, 6, 4, 2, 0);
	
	@Test
	void test_for_linkedHashSet() {
		var lhs = new LinkedHashSet<Integer>(List.of(1, 3, 5, 7, 9, 8, 6, 4, 2, 0));
		
		lhs.addFirst(40);
		lhs.addLast(30);
		System.out.println("Linked Hash Set: " + lhs);
	}
	
	@Test
	@Disabled
	void test_for_treeSet() {
		var treeSet = new TreeSet<Integer>(set);
		var descSet = treeSet.descendingSet();
		
		System.out.println("Sub Set: " + treeSet.subSet(3, false, 6, true));
		System.out.println("Head Set: " + treeSet.headSet(6, true));
		System.out.println("Tail Set: " + treeSet.tailSet(6, false));
		System.out.println("First Element: " + treeSet.first());
		System.out.println("Last Element: " + treeSet.last());
		
		System.out.println("Desc Set: " + descSet);
		System.out.println("Asc Set: " + treeSet);
		
		for(Iterator<Integer> itr = treeSet.iterator(); itr.hasNext(); ) {
			System.out.println(itr.next());
		}
		
	}
		
	@Test
	@Disabled
	void test_for_hashSet() {
		var hashSet = new HashSet<Integer>(set);
		assertEquals(10, hashSet.size());
		assertFalse(hashSet.isEmpty());
		
		assertFalse(hashSet.add(4));
		assertEquals(10, hashSet.size());
		
		assertTrue(hashSet.add(30));
		assertEquals(11, hashSet.size());
		
		assertTrue(hashSet.contains(9));
		assertFalse(hashSet.contains(15));
		
		assertTrue(hashSet.containsAll(Set.of(1, 2, 3, 4, 5)));
		assertFalse(hashSet.containsAll(Set.of(1, 2, 3, 4, 22)));
		
		assertTrue(hashSet.remove(30));
		assertFalse(hashSet.remove(20));
//		assertTrue(hashSet.add(null));
		
//		assertTrue(hashSet.removeAll(Set.of(0, 1, 2, 3)));
		assertTrue(hashSet.removeAll(Set.of(4, 5, 22, 12)));
		assertFalse(hashSet.removeAll(Set.of(12, 34, 56, 20)));
		
		hashSet.retainAll(Set.of(0, 1, 2, 3, 22, 12));
		
		System.out.println("Hash Set: " + hashSet);
		
		hashSet.clear();
		assertEquals(0, hashSet.size());
		assertTrue(hashSet.isEmpty());
	}

}
