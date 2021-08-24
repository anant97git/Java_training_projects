package com.springcore;


import org.springframework.stereotype.Component;

@Component("Coffee")
public class Coffee implements IHotDrink{
	
	public void serve()
	{
		System.out.println("Coffee is served");
	}
}
