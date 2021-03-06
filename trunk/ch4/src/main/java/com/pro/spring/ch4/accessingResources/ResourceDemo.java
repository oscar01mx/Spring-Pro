package com.pro.spring.ch4.accessingResources;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceDemo {
	 public static void main(String[] args) throws Exception{
	        ApplicationContext ctx = new ClassPathXmlApplicationContext();

	        File file = File.createTempFile("test", "txt");
	        file.deleteOnExit();

	        System.out.println(file.getPath());
	        Resource res1 = ctx.getResource("file:\\" + file.getPath());
	        displayInfo(res1);

	        Resource res2 = ctx.getResource("classpath:test.txt");
	        displayInfo(res2);

	        Resource res3 = ctx.getResource("http://www.autozone.com");
	        displayInfo(res3);
	    }

	    private static void displayInfo(Resource res) throws Exception{
	        System.out.println(res.getClass());
	        System.out.println(res.getURL().getContent());
	        System.out.println("");
	    }

}
