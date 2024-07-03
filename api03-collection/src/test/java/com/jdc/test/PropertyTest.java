package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PropertyTest {
	
	static Properties props = new Properties();
	
	@BeforeAll
	static void init() {
		try {
			props.load(new FileInputStream("src/test/resources/app.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test() {
		assertEquals("/home/pphyo", System.getProperty("user.home"));
		assertEquals("21", System.getProperty("java.version"));
		assertEquals("Collection Api", props.get("app.name"));
		assertEquals("1.0", props.get("app.version"));
		assertEquals("JDC", props.get("app.author"));
	}

}
