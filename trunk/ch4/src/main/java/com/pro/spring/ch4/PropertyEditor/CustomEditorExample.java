package com.pro.spring.ch4.PropertyEditor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomEditorExample {
	 private Name name;

	    public Name getName() {
	        return name;
	    }

	    public void setName(Name name) {
	        this.name = name;
	    }

	    public static void main(String[] args) {
	        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	        ctx.load("META-INF/spring/app-context-xml-customPropertiesConfigurer.xml");
	        ctx.refresh();

	        CustomEditorExample bean =
	            (CustomEditorExample) ctx.getBean("exampleBean");

	        System.out.println(bean.getName());
	    }

}
