package com.training.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class FirstBeanPostProcessor implements BeanPostProcessor,Ordered{

	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		System.out.println("Before Post Processor () "+name);
		return obj;
	}
	
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		System.out.println("After Post Processor () "+name);
		return obj;
	}

	public int getOrder() {
		return Ordered.LOWEST_PRECEDENCE;
	}

	
	
	

}
