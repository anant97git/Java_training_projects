package com.springcore;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component("restaurantBean")
@Scope("prototype")
//@Scope("singleton")
public class Restaurant {
	String message;

	public void setMessage(String s) {
		message = s;
	}

	public void greetCustomer() {
		System.out.println("Hello Customers!! \n" + message);
	}
}
