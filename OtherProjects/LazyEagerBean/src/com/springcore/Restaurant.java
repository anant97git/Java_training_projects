package com.springcore;
//import org.springframework.stereotype.Component;
public class Restaurant {
	IHotDrink ihd;
	
	public Restaurant(IHotDrink i) {
		System.out.println("constructing the restaurant");
		ihd=i;
	}
	public void serve() {
		ihd.prepareHotDrink();
	}
}