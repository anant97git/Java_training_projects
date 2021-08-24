package com.springcore;

import org.springframework.stereotype.Component;

@Component("Tea")
public class Tea implements IHotDrink{
	
	public void serve()
	{
		System.out.println("Tea is served");
	}
}
