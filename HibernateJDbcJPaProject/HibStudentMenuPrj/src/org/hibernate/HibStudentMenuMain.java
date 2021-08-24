package org.hibernate;

import org.hibernate.HibernateUtil;
import org.hibernate.internal.build.AllowSysOut;

import org.hibernate.Studentinfo;

import java.util.*;


public class HibStudentMenuMain {
	
	public static void main(String args[])
	{
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
//		  session.beginTransaction();
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the value for menu :-");
		  System.out.println("1 : Insert ");
		  System.out.println("2 : Read ");
		  System.out.println("3 : Update ");
		  System.out.println("4 : Delete ");
		  System.out.println("5 : Read All ");
		  System.out.println("other value : close");
		  
		  while(true)
		  {
			  System.out.println("Enter the value :- ");
			  int val = sc.nextInt();
			  
			  if (val == 1)
			  {
				  Studentinfo si = new Studentinfo();
				  System.out.println("Enter the name :- ");
				  String name = sc.next();
				  System.out.println("Enter the fees :- ");
				  int fees = sc.nextInt();
				  System.out.println(" Enter the course :- ");
				  String course = sc.next();
				  System.out.println(" Enter the result :- ");
				  String result = sc.next();
				  
				  si.setName(name);
				  si.setFees(fees);
				  si.setCourse(course);
				  si.setResult(result);
				  
				  session.beginTransaction();
				  session.save(si);
				  session.getTransaction().commit();
			  }
			  else if (val == 2)
			  {
		        System.out.println("Enter the id to read :- ");
		        int id = sc.nextInt();
		        
		        Studentinfo st = (Studentinfo)session.get(Studentinfo.class, 1);
		        System.out.println("read :- "+st);
				  
			  }
			  else if(val == 3)
			  {
				  System.out.println("Enter the id to update :- ");
			      int id = sc.nextInt();
			        
			      Studentinfo st = (Studentinfo)session.get(Studentinfo.class, id);
			      System.out.println(st);
			      st.setFees(40000);
			      session.beginTransaction();
			      session.save(st);
			      session.getTransaction().commit();
			  }
			  else if(val == 4)
			  {
				  System.out.println("Enter the id to delete :- ");
			      int id = sc.nextInt();
			        
			      Studentinfo st = (Studentinfo)session.get(Studentinfo.class, id);
//			      st.setFees(35000);
			      session.beginTransaction();
			      session.delete(st);
			      session.getTransaction().commit();
			  }
			  else if (val == 5)
			  {
				  System.out.println(" list of all the students :-");
			      session.beginTransaction();

				  List<Studentinfo> stlist = new ArrayList<Studentinfo>();
				  for (Object oneObject : session.createQuery("FROM studentinfo").getResultList())
				  {
					  stlist.add((Studentinfo)oneObject);
				  }
				  
				  System.out.println("hello");
				 
				  for (Studentinfo st : stlist) {
					  System.out.println(st);
				  }
				  
			      session.getTransaction().commit();
			  }
			  else 
			  {
				  session.close();
				  sessionFactory.close();
				  break;
			  }
		  }	  
	}
}
