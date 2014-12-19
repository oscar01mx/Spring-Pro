package com.pro.spring.ch4.applicationContextInJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSimpleExample {
	 public static void main(String[] args) {
	        ApplicationContext ctx = new
	            AnnotationConfigApplicationContext(AppConfig2.class);

	        MessageRenderer renderer =
	            ctx.getBean("messageRenderer", MessageRenderer.class);

	        renderer.render();
	    }

}
