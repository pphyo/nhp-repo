package com.pphyo.facade;

public class SoundSystem {
	
	public void on() {
		System.out.println("Sound system is on.");
	}
	
	public void setVolume(int volume) {
		System.out.println("Setting volume to " + volume);
	}
	
	public void surroundSound() {
		System.out.println("Surround sound is on.");
	}
	
	public void off() {
		System.out.println("Sound system is off.");
	}

}
