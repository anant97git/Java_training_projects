package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class DeleteStudent {
  public static void main(String[] args)  {
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  
  session.beginTransaction();
  Student student = (Student)session.load(Student.class, 2);//delete where id=2
  session.delete(student);
  System.out.println("Deleted Successfully");
  session.getTransaction().commit();
     sessionFactory.close();
 }	}