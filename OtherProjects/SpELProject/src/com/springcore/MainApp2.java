package com.springcore;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;

public class MainApp2 {
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		Expression exp = parser.parseExpression("'Hello SPEL'.concat('!')");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		
	}  
}

