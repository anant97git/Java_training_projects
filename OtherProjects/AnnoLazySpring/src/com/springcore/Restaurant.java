/// here, restaurnat is dependent on tea
package com.springcore;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
@Component("restaurantBean")
//@Lazy
public class Restaurant {
//	@Lazy
	iHotDrink ihd;	
	@Autowired
	public Restaurant(iHotDrink i) {
		ihd = i;
		System.out.println("Restaurant Constructed");
	}
	public void greetCustomer() {
		ihd.prepareHotDrink();
	}
  }


// restaurnat and tea are independent of each other
//package com.springcore;
//import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Lazy;
//
//@Component("restaurantBean")
////@Lazy
//public class Restaurant {
//
//	
//	public Restaurant() {
//		System.out.println("Restaurant Constructed");
//	}
//	public void greetCustomer() {
//		System.out.println("Hello Customers!!");
//	}
//}

