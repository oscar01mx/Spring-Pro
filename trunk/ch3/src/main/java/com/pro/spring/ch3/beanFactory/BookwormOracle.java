package com.pro.spring.ch3.beanFactory;

import org.springframework.stereotype.Service;

@Service("oracle2")
public class BookwormOracle implements Oracle {

	public String defineMeaningOfLife() {
		return "Enciclopedias son un desperdicio de dinero - use internet";
	}

}
