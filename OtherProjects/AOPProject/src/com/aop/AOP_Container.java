package com.aop;

public class AOP_Container {
	
	public ProxyRestaurant getRestaurant() {
		
//		BeforeAdv b = new BeforeAdv();
//		AroundAdv ar = new AroundAdv();
//		AfterAdv af = new AfterAdv();
//		
//		b.before();
//		ar.around();
//		af.after();
		
		return new ProxyRestaurant();
	}
}
