package com.pphyo.bridge;

public abstract class Device {
	
	protected boolean enabled;
	protected int volume;
	protected int channel;
	
	public abstract boolean isEnabled();
	public abstract void enable();
	public abstract void disable();
	public abstract int getVolume();
	public abstract void setVolume(int percent);
	public abstract int getChannel();
	public abstract void setChannel(int channel);

}
