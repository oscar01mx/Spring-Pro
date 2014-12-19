package com.pro.spring.ch4.beanSpringAware;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNamePrinter implements BeanNameAware{
	private String beanName;

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void someOperation() {
        System.out.println("Bean [" + beanName + "] - someOperation()");
    }

}
