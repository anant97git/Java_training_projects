package com.springcore;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
public class MainApp6 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		// arithmetic operator
		System.out.println(parser.parseExpression("'Hello SPEL'+'!'").getValue());
System.out.println(parser.parseExpression("10 * 10/2").getValue());
		System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());
		// logical operator
		System.out.println(parser.parseExpression("true and true").getValue());
		// Relational operator
		System.out.println(parser.parseExpression("'Hello'.length()==5").getValue());
	}
}