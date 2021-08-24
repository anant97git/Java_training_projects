package com.springcore;

import org.springframework.stereotype.Component;

@Component("idhello1")
//@Component
public class HelloAndy {
	private String message; // property

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}