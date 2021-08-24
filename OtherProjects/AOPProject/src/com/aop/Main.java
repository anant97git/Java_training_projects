package com.aop;

public class Main {
	
	public static void main(String args[]) {
		
		AOP_Container ac = new AOP_Container();
//		ac.getRestaurant();
		
		ProxyRestaurant pr = ac.getRestaurant();
		pr.serve();
	}
}
