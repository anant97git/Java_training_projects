package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
//		HelloWorld obj = (HelloWorld) context.getBean(HelloWorld.class);
		 HelloWorld obj = (HelloWorld) context.getBean("idhello");
		obj.setMessage("Hello World!");
		obj.getMessage();
		context.close();
	}
}