package com.springcore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestSpringProject {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println("Context Created!");
		context.scan("com.springcore");
		context.refresh();
		System.out.println("GetBean called");
		Restaurant obj1 = (Restaurant) context.getBean("restaurantBean");
		obj1.greetCustomer();
	
context.close();
	}
}