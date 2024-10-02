package com.pphyo.oop;

import com.pphyo.oop.nested.OuterClazz;
import com.pphyo.oop.nested.OuterClazz.InnerClazz;

public class NestedClassApp {

	public static void main(String[] args) {
		
		var app = new NestedClassApp();
		app.run();
		
	}
	
	void run() {
		var outer = new OuterClazz();
		InnerClazz inner = outer.new InnerClazz();
		inner.accessMember();
		
		OuterClazz.NestedClazz nested = new OuterClazz.NestedClazz();
		nested.accessMember(outer);

	}

}
