package com.pro.spring.ch3.beanFactory;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfigAnnotation")
public class InjectSimpleConfigAnnotation {
	
	 	private String name = "Chris Tf";
	 	private int age = 38;
	 	private float height = 1.778f;
	 	private boolean programmer = true;
	 	
	 	public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public float getHeight() {
			return height;
		}
		public boolean isProgrammer() {
			return programmer;
		}
		public Long getAgeInSeconds() {
			return ageInSeconds;
		}
		private Long ageInSeconds = 1009843200L;

}
