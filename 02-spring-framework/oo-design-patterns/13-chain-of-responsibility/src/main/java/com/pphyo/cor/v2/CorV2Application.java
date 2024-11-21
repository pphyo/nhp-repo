package com.pphyo.cor.v2;

public class CorV2Application {
	
	public static void main(String[] args) {
		
		FrontEndLayer front = new FrontEndLayer();
		MiddleLayer middle = new MiddleLayer();
		BackEndLayer back = new BackEndLayer();
		DatabaseLayer database = new DatabaseLayer();
		
		front.setNext(middle);
		middle.setNext(back);
		back.setNext(database);
		
		front.handle(100);
		
	}

}
