package com.pro.spring.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldSpringDI {

	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/Spring/app-context.xml");
		
		MessageRenderer mr = ctx.getBean("renderer",MessageRenderer.class);
		mr.render();
	}
}
