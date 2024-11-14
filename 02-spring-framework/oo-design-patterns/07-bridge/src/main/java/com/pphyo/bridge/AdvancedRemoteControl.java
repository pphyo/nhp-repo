package com.pphyo.bridge;

public class AdvancedRemoteControl extends RemoteControl {

	private boolean mute;
	private int volumeBeforeMute;
	
	public AdvancedRemoteControl(Device device) {
		super(device);
	}
	
	public void toggleMute() {
		if(mute) {
			mute = !mute;
			volumeBeforeMute = device.getVolume();
		} else {
			mute = !mute;
			device.setVolume(volumeBeforeMute);
		}
	}

}
