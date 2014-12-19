package com.pro.spring.ch2;

public interface MessageRenderer {
	void render();
	void setMessageProvider(MessageProvider provider);
	MessageProvider getMessageProvider();
}
