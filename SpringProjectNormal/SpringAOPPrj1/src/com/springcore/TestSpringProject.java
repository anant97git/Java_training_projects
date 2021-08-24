//package com.springcore;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//public class TestSpringProject {
//	public static void main(String[] args) {  
//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		Restaurant restaurantObj = (Restaurant) context.getBean("proxy",Restaurant.class);
//		System.out.println("RestaurantBean Initialised");
//		((AbstractApplicationContext)context).registerShutdownHook();
//		restaurantObj.greetCustomer(0);
//	 }  
//} 


package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpringProject {
	public static void main(String[] args) {  
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("----------------");
Restaurant restaurantObj = (Restaurant) context.getBean("proxy",Restaurant.class);
		System.out.println("RestaurantBean Initialised");
		((AbstractApplicationContext)context).registerShutdownHook();
		try{
		restaurantObj.greetCustomer(01);  }
		catch(Exception e)
		{ System.out.println(e.getStackTrace());}
	}  
} 