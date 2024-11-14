package com.pphyo.bridge;

public class Television extends Device {
	
	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void enable() {
		enabled = true;
	}

	@Override
	public void disable() {
		enabled = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int percent) {
		volume = percent;
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		super.channel = channel;
	}

}
