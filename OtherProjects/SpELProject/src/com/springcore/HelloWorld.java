package com.springcore;
import org.springframework.stereotype.Component;
@Component
public class HelloWorld {
	private String message; // property
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessageProp() {
		System.out.println("Your Message : " + message);
	}
}

