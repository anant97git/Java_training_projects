package com.springcore;

import org.springframework.stereotype.Component;

@Component("Div")
public class DivOperation implements Operation {
	public int getOperationValue(int a, int b) {
		
		if (b!=0)
			return a/b;
		else
			return 0;
	}
}
