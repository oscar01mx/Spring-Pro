package com.pro.spring.ch3.beanFactory;

public interface ArtworkSender {
	 void sendArtwork(String artworkPath, Recipient recipient);
	 String getFriendlyName();
	 String getShortName();
}
