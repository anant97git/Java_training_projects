package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;


public class TestSpringProject {
	
	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
   		context.scan("com.springcore");
   		context.refresh();
   		
   		Scanner sc = new Scanner(System.in);
   		
   		IOP iop = (IOP) context.getBean("iopContainer");
   		
   		Operation op;
   		
   		
   		System.out.println("enter 1 for add \n enter2 for sub \n enter 3 for mult \n enter 4 for divide");
   		
   		while (true)
   		{
			System.out.println("enter the value ");
			int val = sc.nextInt();
			if (val<1 || val>4)
			{
				System.out.println("exit");
				break;
			}
			System.out.println("enter the value a :- ");
			int a = sc.nextInt();
			System.out.println("enter the value b :- ");
			int b = sc.nextInt();
			
			if (val == 1)
			{
				op = (AddOperation) context.getBean("Add");
				System.out.println("answer = "+iop.getOperationValue(op, a, b));
			}
			else if (val == 2)
			{
				op = (MinusOperation) context.getBean("Minus");
				System.out.println("answer = "+iop.getOperationValue(op, a, b));
			}
			else if (val == 3)
			{
				op = (MultOperation) context.getBean("Mult");
				System.out.println("answer = "+iop.getOperationValue(op, a, b));
			}
			else if (val == 4)
			{
				op = (DivOperation) context.getBean("Div");
				System.out.println("answer = "+iop.getOperationValue(op, a, b));
			}
   		}
   		
//   		while (true)
//   		{
//			System.out.println("enter the value ");
//			int val = sc.nextInt();
//			if (val<1 || val>4)
//			{
//				System.out.println("exit");
//				break;
//			}
//			System.out.println("enter the value a :- ");
//			int a = sc.nextInt();
//			System.out.println("enter the value b :- ");
//			int b = sc.nextInt();
//			
//			System.out.println("result :- "+iop.getOperationValue(val, a, b));
//				
//   		}
   		
//   		while(true)
//   		{
//   			System.out.println("enter the value ");
//   			int val = sc.nextInt();
//   			if (val<1 || val>4)
//   			{
//   				System.out.println("exit");
//   				break;
//   			}
//   			System.out.println("enter the value a :- ");
//   			int a = sc.nextInt();
//   			System.out.println("enter the value b :- ");
//   			int b = sc.nextInt();
//   			
//   			if (val == 1)
//   			{
//   				AddOperation aop = (AddOperation) context.getBean("Add");
//   				int ans = aop.getOperationValue(a, b);
//   				System.out.println("result sum = "+ans);
//   			}
//   			else if (val == 2)
//   			{
//   				MinusOperation aop = (MinusOperation) context.getBean("Minus");
//   				int ans = aop.getOperationValue(a, b);
//   				System.out.println("result sum = "+ans);	
//   			}
//   			else if (val == 3)
//   			{
//   				MultOperation aop = (MultOperation) context.getBean("Mult");
//   				int ans = aop.getOperationValue(a, b);
//   				System.out.println("result sum = "+ans);	
//   			}
//   			else if (val == 4)
//   			{
//   				DivOperation aop = (DivOperation) context.getBean("Div");
//   				int ans = aop.getOperationValue(a, b);
//   				System.out.println("result sum = "+ans);	
//   			}
//   			else
//   			{
//   				System.out.println("exit");
//   				break;
//   			}
//   		}
		
	}
}
