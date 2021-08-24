package io.javabrains;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class JpaReadMain {

	public static void main(String args[])
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee1 = entityManager.find(Employee.class,1);
		Employee employee2 = entityManager.find(Employee.class,2);
		System.out.println(employee1);
		System.out.println(employee2);
		
		Employee employee3 = entityManager.find(Employee.class,22);
		System.out.println(employee3);
		
		
		
	}
}
