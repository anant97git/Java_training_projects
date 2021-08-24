package com.aop;

public class Point_cut {
	
	public void joinPoint() {
		BeforeAdv b = new BeforeAdv();
		AroundAdv ar = new AroundAdv();
		AfterAdv af = new AfterAdv();
		Paypal p = new Paypal();
		
		if (p instanceof Paypal)
			p.after();
		
		if (b instanceof BeforeAdv)
			b.before();
		
		if (ar instanceof AroundAdv)
			ar.around();
		
		if (af instanceof AfterAdv)
			af.after();
		
		
	}
}
