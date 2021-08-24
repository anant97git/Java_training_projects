package com.springcore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.StandardEvaluationContext;
public class MainApp {
	public static void main(String[] args) {
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();

		Restaurant obj=(Restaurant)context.getBean(Restaurant.class); 
		IHotDrink Ihd=(IHotDrink)context.getBean(Coffee.class);
		
		StandardEvaluationContext SEcontext=new StandardEvaluationContext(obj);  
		ExpressionParser parser = new SpelExpressionParser(); 
		parser.parseExpression("iHotDrink").setValue(SEcontext, Ihd);
		obj.serveDrink();  
	}
}
