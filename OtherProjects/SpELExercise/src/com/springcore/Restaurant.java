package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	private IHotDrink iHotDrink;
	private String val;
	// property
	
	Restaurant(){}
	
	public IHotDrink getiHotDrink() {
		return iHotDrink;
	}
	

	public void setiHotDrink(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}
	
	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
		
		if (val == "Tea")
			setiHotDrink(new Tea());
		else if (val == "Coffee")
			setiHotDrink(new Coffee());
		else if(val == "Soup")
			setiHotDrink(new Soup());
	}

	public void serveDrink() {
		iHotDrink.serve();
	}
}
