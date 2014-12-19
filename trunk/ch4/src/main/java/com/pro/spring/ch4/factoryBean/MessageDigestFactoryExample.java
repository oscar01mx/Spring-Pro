package com.pro.spring.ch4.factoryBean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestFactoryExample {
	  public static void main(String[] args) {
	        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	        ctx.load("META-INF/spring/app-context-xml-factoryBean-methodAttribute.xml");
	        ctx.refresh();

	        MessageDigester digester = (MessageDigester) ctx.getBean("digester");
	        digester.digest("Hello World!");
	    }

}
