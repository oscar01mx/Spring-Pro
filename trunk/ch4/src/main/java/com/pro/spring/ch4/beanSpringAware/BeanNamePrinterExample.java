package com.pro.spring.ch4.beanSpringAware;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNamePrinterExample {
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-context-xml-setBeanName.xml");
        ctx.refresh();

        BeanNamePrinter bean = (BeanNamePrinter) ctx.getBean("beanNamePrinterHello");
        bean.someOperation();
    }

}
