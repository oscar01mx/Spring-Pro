package com.pro.spring.ch3.beanFactory;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class XMLConfigWithAnnotations {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("META-INF/spring/xml-context-annotation.xml"));
		ctx.refresh();
		
		Oracle oracle = ctx.getBean("oracle",BookwormOracle.class);
		
		System.out.println(oracle.defineMeaningOfLife());

	}

}
