package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
		Restaurant obj1 = (Restaurant) context.getBean("restaurantBean");
		obj1.setMessage("Message from Obj1");
		obj1.greetCustomer();
		Restaurant obj2 = (Restaurant) context.getBean("restaurantBean");
		obj2.greetCustomer();
		context.close();
	}
}