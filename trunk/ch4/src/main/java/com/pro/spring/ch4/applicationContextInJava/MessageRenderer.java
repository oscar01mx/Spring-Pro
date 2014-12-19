package com.pro.spring.ch4.applicationContextInJava;

public interface MessageRenderer {
	 void render();
	    void setMessageProvider(MessageProvider provider);
	    MessageProvider getMessageProvider();

}
