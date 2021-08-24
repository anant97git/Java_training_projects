package io.javabrains;

import java.util.*;
import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaStarterMain {
	
	public static void main(String args[]) {
		 
		Employee employee1 = new Employee();
		employee1.setName("Foo Bar");
		employee1.setSsn("12883");
		employee1.setDob(new Date());
		employee1.setAge(20);
		employee1.setType(EmployeeType.CONTRACTOR);
			
		Employee employee2 = new Employee();
		employee2.setName("Bar Baz");
		employee2.setSsn("123400");
		employee2.setDob(new Date());
		employee2.setAge(30);
		employee2.setType(EmployeeType.FULL_TIME);
		
		AccessCard card1 = new AccessCard();
		card1.setIssuedDate(new Date());
		card1.setActive(true);
		card1.setFirmwareVersion("1.0.0");
		employee1.setCard(card1);
		card1.setOwner(employee1);
		
		AccessCard card2 = new AccessCard();
		card2.setIssuedDate(new Date());
		card2.setActive(false);
		card2.setFirmwareVersion("1.2.0");
		employee2.setCard(card2);
		card2.setOwner(employee2);
		
		PayStub payStub1 = new PayStub();
		payStub1.setPayPeriodEnd(new Date());
		payStub1.setPayPeriodStart(new Date());
		payStub1.setSalary(1000);
		payStub1.setEmployee(employee1);
		
		PayStub payStub2 = new PayStub();
		payStub2.setPayPeriodEnd(new Date());
		payStub2.setPayPeriodStart(new Date());
		payStub2.setSalary(2000);
		payStub2.setEmployee(employee1);
		
		EmailGroup group1 = new EmailGroup();
		group1.setName("Company cooler discussion");
		
		employee1.addEmailGroup(group1);
		employee2.addEmailGroup(group1);
		group1.addMembers(employee1);
		group1.addMembers(employee2);
		
		EmailGroup group2 = new EmailGroup();
		group2.setName("Engineering");
		group2.addMembers(employee1);
		employee1.addEmailGroup(group2);
		
		
		(employee1.getPayStub()).add(payStub1);
	    (employee1.getPayStub()).add(payStub2);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		
		entityManager.persist(card1);
		entityManager.persist(card2);
		
		entityManager.persist(payStub1);
		entityManager.persist(payStub2);
		
		entityManager.persist(group1);
		entityManager.persist(group2);
		
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
