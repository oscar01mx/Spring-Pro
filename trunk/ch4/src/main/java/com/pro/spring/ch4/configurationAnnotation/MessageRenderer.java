package com.pro.spring.ch4.configurationAnnotation;

public interface MessageRenderer {
	 void render();
	 void setMessageProvider(MessageProvider provider);
	 MessageProvider getMessageProvider();

}
