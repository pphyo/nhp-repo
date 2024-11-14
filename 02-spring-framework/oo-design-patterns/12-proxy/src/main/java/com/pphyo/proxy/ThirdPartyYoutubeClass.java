package com.pphyo.proxy;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
	
	@Override
	public void listVideo() {
		System.out.println("Listing video from " + this.getClass().getSimpleName());
	}

	@Override
	public void getVideoInfo(int id) {
		System.out.println("Getting video info from " + this.getClass().getSimpleName());
	}

	@Override
	public void downloadVideo(int id) {
		System.out.println("Downloading video from " + this.getClass().getSimpleName());
	}

}
