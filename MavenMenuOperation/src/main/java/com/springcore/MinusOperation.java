package com.springcore;

import org.springframework.stereotype.Component;

@Component("Minus")
public class MinusOperation implements Operation {

	public int getOperationValue(int a, int b) {
		if (a>b)
			return a-b;
		else
			return b-a;
	}
}
