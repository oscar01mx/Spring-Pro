package com.pro.spring.ch3.beanFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimpleAnnotation {
	
	@Value("Oscar Diaz")
	private String name;
	@Value("26")
	private int age;
	@Value("1.80")
    private float height;
	@Value("true")
    private boolean programmer;
	@Value("1009843200")
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/xml-context-annotation.xml");
        ctx.refresh();

        InjectSimpleAnnotation simple = (InjectSimpleAnnotation)ctx.getBean("injectSimple");

        System.out.println(simple);
    }

    public String toString() {
        return "Name :" + name + "\n"
            + "Age:" + age + "\n"
            + "Age in Seconds: " + ageInSeconds + "\n"
            + "Height: " + height + "\n"
            + "Is Programmer?: " + programmer;
    }
    
}
