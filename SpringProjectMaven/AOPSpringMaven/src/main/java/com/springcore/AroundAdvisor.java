package com.springcore;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class AroundAdvisor {
	@Around("execution(* com.springcore.Restaurant.greetCustomer(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
System.out.println("step1 :- additional concern around before actual (give menu) logic");  
		joinPoint.proceed(); // here, next around advise logaround1 will be called
        System.out.println("step 4 :- additional concern around after actual (take money) logic");  
    }
	
	@Around("execution(* com.springcore.Restaurant.greetCustomer(..))")
    public void logAround1(ProceedingJoinPoint joinPoint) throws Throwable {
System.out.println("step2 :- additional concern around before actual (take order) logic");  
		joinPoint.proceed(); // here, next around advice will be called (if it exists)
		// if it does not exists then the greetCustomer method (business logic / pointcut) method 
		// will be called 
        System.out.println(" step3 :- additional concern around after actual (bill) logic");  
    }
}
