package com.aop;

public class ProxyRestaurant {
	
	public void serve() {
		
		Point_cut pc = new Point_cut();
		pc.joinPoint();
		
//		BeforeAdv b = new BeforeAdv();
//		AroundAdv ar = new AroundAdv();
//		AfterAdv af = new AfterAdv();
//		
//		b.before();
//		ar.around();
//		af.after();
	}
}
