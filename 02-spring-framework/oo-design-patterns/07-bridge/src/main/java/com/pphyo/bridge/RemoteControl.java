package com.pphyo.bridge;

public class RemoteControl {
	
	protected Device device;

	public RemoteControl(Device device) {
		this.device = device;
	}
	
	public void togglePower() {
		if(device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}
	
	public void volumeDown() {
		if(device.getVolume() > 0)
			device.setVolume(device.getVolume() - 10);
	}
	
	public void volumeUp() {
		if(device.getVolume() <= 100)
			device.setVolume(device.getVolume() + 10);
	}
	
	public void channelUp() {
		device.setChannel(device.getChannel() + 1);
	}
	
	public void channelDown() {
		if(device.getChannel() > 1)
			device.setChannel(device.getChannel() - 1);
	}

}
