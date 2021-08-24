package com.springcore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyAppConfiguration {
    @Bean(name="idhello")
	public HelloWorld getHelloWorld() {
	    HelloWorld h = new HelloWorld();
	    h.setMessage("Hello Anant");
		return h;
    }
 
 @Bean(name="idhello2")
	public HelloWorld getHelloWorld2() {
	    HelloWorld h = new HelloWorld();
	    h.setMessage("Hello world");
		return h;
 }
}