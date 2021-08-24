package com.jdbc;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeDao dao=(EmployeeDao)context.getBean("edao");
		//int status=dao.saveEmployee(new Employee(101,"Abc",50000));
//        int status=dao.saveEmployee(new Employee(102,"Abc",5000));
//		System.out.println(status);
//		int status=dao.updateEmployee(new Employee(102,"AAA",35000));
//		System.out.println(status);		
//		int status=dao.saveEmployee(new Employee(103,"Tanvi",50000));
//		System.out.println(status);
		
//        Employee e=new Employee();
//		e.setId(103);
//		int status=dao.deleteEmployee(e);
//		System.out.println(status);     
		
		List<Employee> list=dao.getAllEmployees();
		for(Employee e:list)
			System.out.println(e);
		context.close();
	}
}