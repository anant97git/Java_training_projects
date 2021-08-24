package com.springcore;


public class Login {
	
	public void doLogin() {
		
	}
	
	public void init() {
		System.out.println("login bean is inited");
	}
	
	public void destroy() {
		System.out.println(" login bean is destroyed");
	}
}


//package com.springcore;
//public class Restaurant {
//    public void greetCustomer(int booking) {
//        	if(booking == 0)
//    		throw new ArithmeticException();
//   	System.out.println("Hello Customers");
//    }
//   public void init() {
//      System.out.println("Restaurant Bean is going through init.");
//   }
//   public void destroy() {System.out.println("Bean will destroy now."); }
//}