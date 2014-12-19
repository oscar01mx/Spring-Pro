package com.pro.spring.ch5.proxy.performance;

public class DefaultSimpleBean implements SimpleBean{
	private long dummy = 0;

    public void advised() {
        dummy = System.currentTimeMillis();
    }

    public void unadvised() {
        dummy = System.currentTimeMillis();
    }
}
