package com.springcore;

public class Tea implements IHotDrink {
	public Tea() {
		System.out.println("tea is constructed ");
	}

	@Override
	public void prepareHotDrink() {
		System.out.println("Dear customer, we are preparing tea for you!!");
	}
}