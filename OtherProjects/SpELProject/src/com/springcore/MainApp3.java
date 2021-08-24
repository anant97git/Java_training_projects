package com.springcore;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;

public class MainApp3 {
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		Expression exp = parser.parseExpression("'Hello SPEL'.bytes");  
		byte[] bytes = (byte[]) exp.getValue();  
		for(int i=0;i<bytes.length;i++){  
		    System.out.print(bytes[i]+" ");  
		}  
		
	}  
}
