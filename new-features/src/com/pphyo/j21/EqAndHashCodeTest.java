package com.pphyo.j21;

public class EqAndHashCodeTest {

	public static void main(String[] args) {
		runForUser();
		var i = 100;
		System.out.println(i);
	}
	
	static void runForUser() {
		User usr1 = new User();
		usr1.setName("Nami");
		usr1.setPassword("Nami0");
		
		User usr2 = new User();
		usr2.setName("Nami");
		usr2.setPassword("Nami0");
		
		System.out.println(Integer.toHexString(usr1.hashCode()));
		System.out.println(usr1.toString());
		System.out.println(usr2);
		System.out.println(usr1 == usr2);
		System.out.println(usr1.equals(usr2));
	}
	
	static void runForString() {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s4 == s3: " + (s4 == s3));
		
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
		System.out.println("s4.equals(s3): " + (s4.equals(s3)));
	}
	
}
