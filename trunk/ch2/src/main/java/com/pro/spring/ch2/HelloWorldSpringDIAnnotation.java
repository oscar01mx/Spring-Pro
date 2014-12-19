package com.pro.spring.ch2;

import org.springframework.context.support.GenericXmlApplicationContext;


public class HelloWorldSpringDIAnnotation {

	public static void main(String[] args){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("META-INF/Spring/app-context-constructor-injection-annotation.xml");
		ctx.refresh();
//		
//		MessageRenderer mr = ctx.getBean("renderer",MessageRenderer.class);
//		mr.render();
		
		MessageProvider messageProvider = ctx.getBean("messageProvider",
	            MessageProvider.class);

	        System.out.println(messageProvider.getMessage());
	}
}
