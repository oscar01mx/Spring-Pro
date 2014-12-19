package com.pro.spring.ch5.pointcut.dynamic;

public class SampleBean {
	public void foo(int x) {
        System.out.println("Invoked foo() with: " + x);
    }

    public void bar() {
        System.out.println("Invoked bar()");
    }
}
