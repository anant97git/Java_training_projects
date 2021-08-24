package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) new AnnotationConfigApplicationContext(
				MyAppConfiguration.class);
//		HelloWorld obj = (HelloWorld) context.getBean("idhello2");
		HelloWorld obj = (HelloWorld) context.getBean("idhello2");
		obj.getMessage();
	}
}