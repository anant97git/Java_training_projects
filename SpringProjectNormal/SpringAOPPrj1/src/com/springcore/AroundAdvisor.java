package com.springcore;
import org.aopalliance.intercept.MethodInterceptor;  
import org.aopalliance.intercept.MethodInvocation;  
public class AroundAdvisor implements MethodInterceptor{  
    @Override  
    public Object invoke(MethodInvocation mi) throws Throwable {  
        Object obj;  
        System.out.println("additional concern around before actual (take order) logic");  
        obj=mi.proceed();  
        System.out.println("additional concern around after actual (bill) logic");  
        return obj;  
    }  
 }
