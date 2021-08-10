package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibMapMain {
	
	public static void main(String args[])
	{
	   Doctor doctor1 = new Doctor();
	   doctor1.setDoctor_name("Dr. AJ");
	   
	   Doctor doctor2 = new Doctor();
	   doctor2.setDoctor_name("Dr. AK");
	   
	   Patient pt1 = new Patient();
	   pt1.setPatient_name("Mr. Ys");
	   pt1.setAge(25);
	   pt1.setAddress("Delhi,India");
	   pt1.setDisease("Fever");
	   pt1.setPayment("Done");
	   pt1.setDoctor(doctor1);
	   
	   Patient pt2 = new Patient();
	   pt2.setPatient_name("Mr. Gw");
	   pt2.setAge(25);
	   pt2.setAddress("Delhi,India");
	   pt2.setDisease("Headache");
	   pt2.setPayment("Not Done");
	   pt2.setDoctor(doctor1);
	   
	   Patient pt3 = new Patient();
	   pt3.setPatient_name("Mr. LK");
	   pt3.setAge(25);
	   pt3.setAddress("Mumbai,India");
	   pt3.setDisease("Fever");
	   pt3.setPayment("Not Done");
	   pt3.setDoctor(doctor2);
	   
	   Patient pt4 = new Patient();
	   pt4.setPatient_name("Mr. PH");
	   pt4.setAge(25);
	   pt4.setAddress("Bihar,India");
	   pt4.setDisease("Fever");
	   pt4.setPayment("Done");
	   pt4.setDoctor(doctor2);
	   
	   (doctor1.getPatients()).add(pt1);
	   (doctor1.getPatients()).add(pt2);
	   
	   (doctor2.getPatients()).add(pt3);
	   (doctor2.getPatients()).add(pt4);
	   
	     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	     Session session = sessionFactory.openSession();
	     session.beginTransaction();
	     session.save(doctor1);
	     session.save(pt1);
	     session.save(pt2);
	     session.save(doctor2);
	     session.save(pt3);
	     session.save(pt4);
	     session.getTransaction().commit();
	     session.close();
	     sessionFactory.close();
	   }
}
