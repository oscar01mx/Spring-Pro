package com.pro.spring.ch3.beanFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpelAnnotation")
public class InjectSimpleSpelAnnotation {

		@Value("#{injectSimpleConfigAnnotation.name}")
	  	private String name;
		@Value("#{injectSimpleConfigAnnotation.age + 10}")
	    private int age;
		@Value("#{injectSimpleConfigAnnotation.height}")
	    private float height;
		@Value("#{injectSimpleConfigAnnotation.programmer}")
	    private boolean programmer;
		@Value("#{injectSimpleConfigAnnotation.ageInSeconds}")
	    private Long ageInSeconds;

	    public String toString() {
	        return "Name: " + name + "\n"
	            + "Age: " + age + "\n"
	            + "Age in Seconds: " + ageInSeconds + "\n"
	            + "Height: " + height + "\n"
	            + "Is Programmer?: " + programmer;
	    }

	    public static void main(String[] args) {
	        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	        ctx.load("META-INF/spring/xml-context-annotation.xml");
	        ctx.refresh();

	        InjectSimpleSpelAnnotation simple = (InjectSimpleSpelAnnotation)ctx.getBean("injectSimpleSpelAnnotation");
	        System.out.println(simple);
	    }
}
