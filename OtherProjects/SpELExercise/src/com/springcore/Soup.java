package com.springcore;

import org.springframework.stereotype.Component;

@Component("Soup")
public class Soup implements IHotDrink{
	
	public void serve()
	{
		System.out.println("Soup is served");
	}
}
