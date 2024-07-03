package com.jdc.test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class QueueInterfaceTest {
	
	@Test
	void test_for_priority_queue() {
		Comparator<Integer> desc = (o1, o2) -> o2 - o1;
		var pq = new PriorityQueue<Integer>(desc);
		
		for(int i = 9; i >= 0; i --) {
			pq.add(i);
		}
		
		System.out.println(pq);
	}
	
	@Test
	@Disabled
	void test_for_linked_list() {
		var ll = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i ++) {
			if(i % 2 == 0) {
				ll.offerLast(i);
			} else {
				ll.offerFirst(i);
			}
		}
		
		System.out.println(ll);
		
	}

}
