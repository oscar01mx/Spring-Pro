package com.pro.spring.ch4.configurationAnnotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Jsr330Example {
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-context-configurationAnnotation.xml");
        ctx.refresh();

        MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }

}
