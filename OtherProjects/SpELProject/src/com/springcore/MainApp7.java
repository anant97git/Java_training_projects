package com.springcore;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.StandardEvaluationContext;
public class MainApp7 {
	public static void main(String[] args) {
		HelloWorld hello=new HelloWorld();  
		StandardEvaluationContext context=new StandardEvaluationContext(hello);  
		ExpressionParser parser = new SpelExpressionParser();  
		
parser.parseExpression("message").setValue(context,"Hello SPEL");  
		hello.getMessageProp();  
	}
}
//In SpEL, we can store a value in the context variable and use the variable in the setValue method. To work on context we need to use StandardEvaluationContext class.
//Java