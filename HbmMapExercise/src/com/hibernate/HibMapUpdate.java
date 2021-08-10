package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibMapUpdate {
	
	public static void main(String args[])
	{
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  Patient pt1 = (Patient)session.get(Patient.class, 3);
		  pt1.setPayment("Done"); //update where id=2
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
	}
}
