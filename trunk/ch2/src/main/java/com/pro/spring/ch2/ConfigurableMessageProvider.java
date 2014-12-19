package com.pro.spring.ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
	private String message;
	
//	public ConfigurableMessageProvider(String message) {
//		this.message = message;
//	}
//
//	@Override
//	public String getMessage() {
//		return message;
//	}
	
	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
