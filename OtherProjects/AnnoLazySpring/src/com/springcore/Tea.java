package com.springcore;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class Tea implements iHotDrink {
	public Tea() {
		System.out.println("Tea is Constructed");
	}
	@Override
	public void prepareHotDrink() {
		System.out.println("Preparing Tea");
	}
}