package com.pro.spring.ch5.pointcut.annotation;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

import com.pro.spring.ch5.pointcut.stat1c.SimpleAdvice;

public class AnnotationPointcutExample {
	public static void main(String[] args) {
        SampleAnnotationBean target = new SampleAnnotationBean();

        AnnotationMatchingPointcut pc = AnnotationMatchingPointcut
            .forMethodAnnotation(AdviceRequired.class);
        Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleAdvice());

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        SampleAnnotationBean proxy = (SampleAnnotationBean) pf.getProxy();

        proxy.foo(100);
        proxy.bar();
    }
}
