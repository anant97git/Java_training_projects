package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class MainApp8 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
		HelloWorld hello = (HelloWorld) context.getBean(HelloWorld.class);
		StandardEvaluationContext SEcontext = new StandardEvaluationContext(hello);
		ExpressionParser parser = new SpelExpressionParser();
		parser.parseExpression("message").setValue(SEcontext, "Hello SPEL");
		hello.getMessageProp();
		context.close();
	}
}