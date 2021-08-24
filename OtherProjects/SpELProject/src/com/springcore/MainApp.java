package com.springcore;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;

public class MainApp {
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		Expression exp = parser.parseExpression("'Hello SPEL'");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		//OR  
		//System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
		}  
}