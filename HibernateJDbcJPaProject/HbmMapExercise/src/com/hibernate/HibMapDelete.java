package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibMapDelete {
	
	public static void main(String args[]) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  
		  session.beginTransaction();
//		  Patient pt1 = (Patient)session.load(Patient.class, 2);//delete where id=2
//		  session.delete(pt1);
		  
		  Doctor dc1 = (Doctor)session.load(Doctor.class, 1);
		  session.delete(dc1);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();
	}
}
