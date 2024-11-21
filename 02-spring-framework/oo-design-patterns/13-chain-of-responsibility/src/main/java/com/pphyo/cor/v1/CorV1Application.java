package com.pphyo.cor.v1;

public class CorV1Application {

	public static void main(String[] args) {
		
		BackHandler back = new BackHandler();
		MiddleHandler middle = new MiddleHandler(back);
		FrontHandler front = new FrontHandler(middle);
		
		front.handle(3);

	}

}
