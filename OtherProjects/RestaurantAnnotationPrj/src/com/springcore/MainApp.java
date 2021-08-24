package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) new AnnotationConfigApplicationContext(
				MyAppConfiguration.class);
		Restaurant obj = (Restaurant) context.getBean("idhello2");
//		obj.setMessage("Hello World!");
		obj.getMessage();
	}
}