package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		System.out.println("all lazy beans are constructed after this");
		Restaurant obj = (Restaurant) context.getBean("restaurantBean");
		obj.serve();
	}
}