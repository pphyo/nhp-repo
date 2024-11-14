package com.pphyo.proxy;

public class YoutubeManager {
	
	private ThirdPartyYoutubeLib lib;

	public YoutubeManager(ThirdPartyYoutubeLib lib) {
		this.lib = lib;
	}
	
	public void download(int id) {
		lib.downloadVideo(id);
	}
	
	public void watchVideo(int id) {
		lib.getVideoInfo(id);
	}
	
	public void searchVideo() {
		lib.listVideo();
	}

}
