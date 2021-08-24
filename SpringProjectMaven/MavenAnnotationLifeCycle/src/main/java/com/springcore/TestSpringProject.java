package com.springcore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpringProject {
	public static void main(String[] args) {
            System.out.println("Main Starts : Constructor is called:");
           System.out.println("called: run init method:");
           
          AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
   		context.scan("com.springcore");
   		context.refresh();
           
//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml"); //constructor called
           System.out.println("shutdown hook registered for calling Destroy method before close method");
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
          System.out.println("Run Business Logic:");
		restaurantObj.greetCustomer();	
		restaurantObj=null; //destroy restaurantObj
           System.out.println("Before close method: call destroy method:");
		context.close();
           System.out.println("Post closure we destroy Beans completely by finalize method:");
		System.gc();  //System.gc() calls the garbage collector
		System.out.println("Main Ends");	//threading
	}
}