package com.springcore;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component("restaurantBean")
public class Restaurant {
	public void greetCustomer() { //Business Logic
		System.out.println("3. welcome dear customer!! this is the LifeCycle demo");
	}
	
	@PostConstruct
	public void init() { //init-method of Beans
		System.out.println("2. Restaurant Bean is going through init.");
	}
	
	@PreDestroy
	public void destroy() { //destroy-method of Beans
		System.out.println("4. Bean will destroy now.");
	}
public Restaurant() { //Constructor: instantiation : Context generation
		System.out.println("1.Restaurant Constructor");
	}
	protected void finalize()  	{   //Garbage Collection post Context.close()
	     System.out.println("5. Restaurant is destroyed by the Garbage Collector");  
	}  
}