package com.pphyo.facade;

public class HomeTheaterFacade {
	
	private DvdPlayer dvdPlayer;
	private Projector projector;
	private SoundSystem soundSystem;
	
	public HomeTheaterFacade() {
		dvdPlayer = new DvdPlayer();
		projector = new Projector();
		soundSystem = new SoundSystem();
	}
	
	public void watchMovie(String movie) {
		System.out.println("Ready to watch movie");
		dvdPlayer.on();
		dvdPlayer.play(movie);
		projector.on();
		projector.setInput(dvdPlayer);
		projector.display();
		soundSystem.on();
		soundSystem.setVolume(10);
		soundSystem.surroundSound();
	}
	
	public void endMovie() {
		System.out.println("Shutting down the movie theater...");
		dvdPlayer.stop();
		dvdPlayer.off();
		projector.off();
		soundSystem.off();
	}

}
