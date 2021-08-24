package com.springcore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyAppConfiguration {
 @Bean(name="idhello")
	public Restaurant getRestaurant() {
	 Restaurant r = new Restaurant();
	    r.setMessage("Hello Customers");
		return r;
 }
 
 @Bean(name="idhello2")
	public Restaurant getRestaurant2() {
	 Restaurant r = new Restaurant();
	    r.setMessage("welcome Customers");
		return r;
 }
}