package Day9;

import java.util.*;

class Employee{
	int age;
	String name;
	Employee(){
	}	
	Employee(int age, String name){
		this.age = age;
		this.name = name;
	}
}
class DuplicateNameException extends Exception{  
	DuplicateNameException(String s){  
	  super(s);  
	 }  
	}
class GhostException extends Exception{  
	GhostException(String s){  
	  super(s);  
	 }  
}
class SeniorException extends Exception{  
	SeniorException(String s){  
	  super(s);  
	 }  
	}
class PurvajException extends Exception{  
	PurvajException(String s){  
	  super(s);  
	 }  
	}
public class EmployeeExcep {
   public static void main(String args[])
   {
	   try {
	   List<Employee> le = new ArrayList<Employee>();
	   le.add(new Employee(25,"Anant"));
	   le.add(new Employee(35,"Mohan"));
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the age :- ");
	   int Eage = sc.nextInt();
	   System.out.println("enter the name :- ");
	   String Ename = sc.next();
	   
	   System.out.println("enter new name :- ");
	   String e1 = sc.next();
	   int c = 0;
	   for (Employee e: le) {
		   if ((e.name).equals(Ename))
		   {
			   System.out.println("duplicate");
			   c=1;
			   break;
		   }
	   }
	   if (c==1)
		   throw new DuplicateNameException("Duplicate names are not allowed as Employees");
	   else if (Eage<0)
		   throw new GhostException("Ghost are not allowed as Employees");
	   else if (Eage>60 && Eage<=100)
		   throw new SeniorException("Seniors are not allowed as Employees");
	   else if (Eage>100)
		   throw new PurvajException("Purvaj are not allowed as Employees");
	   else
	   {
		   le.add(new Employee(Eage,Ename));
		   System.out.println("new employee is added");
	   }
	   }
	   catch(Exception e) {
		   System.out.println("Exception occured :- "+e);
	   } 
   }
}
