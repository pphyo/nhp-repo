package com.jdc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MapInterfaceTest {
	
	static Map<String, String> map = new HashMap<>();
	
	@Test
	void test_for_hash_map() {
		map.put("Myanmar", "Naypyidaw");
		map.put("Phillipine", "Naypyidaw");
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		Set<Entry<String, String>> entries = map.entrySet();
		for(Entry<String, String> entry : entries) {
			System.out.println("%s : %s".formatted(entry.getKey(), entry.getValue()));
		}
	}

	@BeforeAll
	static void setUpBeforeClass() {
		map.put("Myanmar", "Yangon");
		map.put("Japan", "Tokyo");
		map.put("Thailand", "Bangkok");
		map.put("China", "Beijin");
		map.put("Malaysia", "Kuala Lampu");
		map.put("Korea", "Seoul");
	}
	
}
