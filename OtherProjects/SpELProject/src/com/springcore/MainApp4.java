package com.springcore;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;

public class MainApp4 {
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		Expression exp = parser.parseExpression("'Hello SPEL'.bytes.length");  
		int length = (Integer) exp.getValue();  
		System.out.println(length);  
		
	}  
}