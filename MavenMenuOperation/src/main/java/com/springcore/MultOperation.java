package com.springcore;

import org.springframework.stereotype.Component;

@Component("Mult")
public class MultOperation implements Operation{
	
	public int getOperationValue(int a, int b) {
		return a*b;
	}
}
