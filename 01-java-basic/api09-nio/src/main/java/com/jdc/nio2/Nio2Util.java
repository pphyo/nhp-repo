package com.jdc.nio2;

public class Nio2Util {
	
	public static void showTitle(String title, String sign) {
		var output = "";
		for(int i = 0, l = title.length(); i < l; i ++)
			output += sign;
		
		System.out.println("%s%s%s".formatted(sign.concat(sign), output, sign.concat(sign)));
		System.out.println("%s%s%s".formatted(sign.concat(" "), title, " ".concat(sign)));
		System.out.println("%s%s%s".formatted(sign.concat(sign), output, sign.concat(sign)));
		System.out.println();
	}

}
