package com.jpa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.ArrayList;

public class Test {  
public static void main(String[] args) {  
 	         ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("d");

//		Employee e = new Employee(101, "Ishu1", 50000); dao.saveEmployee(e);
//		Employee e1 = new Employee(102, "Ishu2", 350000); dao.saveEmployee(e1);
//		Employee e2 = new Employee(103, "Ishu3", 3500); dao.saveEmployee(e2);
		
	//	Employee e3 = new Employee(102, "Ishu4", 550000); dao.updateEmployee(e3);
		
	//	Employee e4=new Employee(); e4.setId(103); dao.deleteEmployee(e4);
			
		  List<Employee> employeeList = dao.getEmployees();
		  for(Employee e5 : employeeList) {System.out.println(e5);}    
    }  
} 