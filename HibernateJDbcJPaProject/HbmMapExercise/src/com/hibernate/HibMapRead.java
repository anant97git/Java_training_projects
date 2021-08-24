package com.hibernate;

import java.util.ArrayList; import java.util.List;	
import org.hibernate.Session;	import org.hibernate.SessionFactory;

public class HibMapRead {

	public static void main(String args[])
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  List<Patient> ptlist = new ArrayList<Patient>();
		  for (Object oneObject : session.createQuery("FROM Patient").getResultList())
		  {
			  ptlist.add((Patient)oneObject);
		  }
		 
		  System.out.println("\n Lists of Patients \n");
		  for (Patient pt : ptlist) {
			  System.out.println(pt);
		  }
		  
		  List<Doctor> dclist = new ArrayList<Doctor>();
		  for (Object oneObject : session.createQuery("FROM Doctor").getResultList())
		  {
			  dclist.add((Doctor)oneObject);
		  }
		 
		  System.out.println("\n Lists of Doctors \n");
		  for (Doctor doc : dclist) {
			  System.out.println(doc);
		  }
		  
		  session.getTransaction().commit();
		  sessionFactory.close();
	}
}
