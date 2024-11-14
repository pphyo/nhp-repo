package com.pphyo.facade;

public class FacadeApplication {
	
	public static void main(String[] args) {
		HomeTheaterFacade facade = new HomeTheaterFacade();
		facade.watchMovie("Wild Robot");
		facade.endMovie();
	}

}
