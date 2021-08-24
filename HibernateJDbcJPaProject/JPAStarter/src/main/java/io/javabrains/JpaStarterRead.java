package io.javabrains;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaStarterRead {
	
	public static void main(String args[]) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee employee1 = entityManager.find(Employee.class, 1);
		System.out.println(employee1.getPayStub());
//		System.out.println(employee1.getName());
//		System.out.println(employee1.getCard());
		
//		AccessCard card1 = entityManager.find(AccessCard.class, 3);
//		System.out.println(card1.getOwner());
		
//		PayStub payStub1 = entityManager.find(PayStub.class, 5);
//		System.out.println(payStub1);
	}
}
