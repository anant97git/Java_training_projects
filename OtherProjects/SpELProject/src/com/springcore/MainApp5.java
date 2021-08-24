package com.springcore;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;

public class MainApp5 {
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		Expression exp = parser.parseExpression("new String('hello spel').toUpperCase()");  
		String message = exp.getValue(String.class);  
		System.out.println(message);  
		//OR  
		
//System.out.println(parser.parseExpression("'hello spel'.toUpperCase()").getValue());  
		
	}  
}