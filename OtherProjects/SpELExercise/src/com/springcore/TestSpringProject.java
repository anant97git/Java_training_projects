package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TestSpringProject {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
		Restaurant rt = (Restaurant) context.getBean(Restaurant.class);
//		IHotDrink Ihd=(IHotDrink)context.getBean(Tea.class);
		
		StandardEvaluationContext SEcontext = new StandardEvaluationContext(rt);
		ExpressionParser parser = new SpelExpressionParser();
		
		parser.parseExpression("iHotDrink").setValue(SEcontext, (IHotDrink)context.getBean(Tea.class));
		rt.serveDrink();
		context.close();
	}
}
