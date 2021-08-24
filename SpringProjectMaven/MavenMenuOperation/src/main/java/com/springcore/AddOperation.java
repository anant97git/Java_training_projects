package com.springcore;

import org.springframework.stereotype.Component;

@Component("Add")
public class AddOperation implements Operation{
	
	public int getOperationValue(int a, int b) {
		return a+b;
	}
}
