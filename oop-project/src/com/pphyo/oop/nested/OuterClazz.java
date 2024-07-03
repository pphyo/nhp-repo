package com.pphyo.oop.nested;

public class OuterClazz {
	
	String outerField = "Outer field";
	static String staticOuterField = "Static outer field";
	
	public class InnerClazz {
		public void accessMember() {
			System.out.println(outerField);
			System.out.println(staticOuterField);
		}
	}
	
	public static class NestedClazz {
		public void accessMember(OuterClazz clazz) {
			System.out.println(clazz.outerField);
			System.out.println(staticOuterField);
		}
	}

}
