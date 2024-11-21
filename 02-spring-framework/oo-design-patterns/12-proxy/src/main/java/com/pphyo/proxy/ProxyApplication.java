package com.pphyo.proxy;

public class ProxyApplication {
	
	public static void main(String[] args) {
		
		YoutubeManager manager = new YoutubeManager(new ThirdPartyYoutubeClass());
		manager.download(1);
		manager.watchVideo(1);
		manager.searchVideo();
		
	}

}