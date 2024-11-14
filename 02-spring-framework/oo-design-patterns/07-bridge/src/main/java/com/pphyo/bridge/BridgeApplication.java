package com.pphyo.bridge;

public class BridgeApplication {

	public static void main(String[] args) {
		
		var tv = new Television();
		var tvRemote = new RemoteControl(tv);
		tvRemote.togglePower();
		togglePower(tv);
		tvRemote.togglePower();
		togglePower(tv);
		
		tvRemote.volumeUp();
		System.out.println(tv.getVolume());

	}
	
	static void togglePower(Device device) {
		System.out.println(device.isEnabled() ? "On" : "Off");
	}

}
