package com.aop;

public class AroundAdv {
	
	public void around() {
		System.out.println("Menu");
		
//		Restaurant r = new Restaurant();
//		r.serve();
		concern();
		System.out.println("bills");
	}
	
	public void concern() {
		Restaurant r = new Restaurant();
		r.serve();
	}
}
