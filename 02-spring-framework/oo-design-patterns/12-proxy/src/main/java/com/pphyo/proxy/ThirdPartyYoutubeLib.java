package com.pphyo.proxy;

public interface ThirdPartyYoutubeLib {
	
	void listVideo();
	void getVideoInfo(int id);
	void downloadVideo(int id);

}
