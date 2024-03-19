package org.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyMerchant {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the  phone number and password");
	
	 long phone = sc.nextLong();
	String password = sc.next();
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	
	EntityManager manager = factory.createEntityManager();
	
	Query q = manager.createQuery("select m from mecrchant m where m.phone=?1 and m.Password=?2");
	
	q.setParameter(1, phone);
	q.setParameter(2, password);
	
	try
	{
		Merchant m = (Merchant) q.getSingleResult();
		System.out.println("Verification Succesfull");
		System.out.println(m);
	}
	catch (NoResultException e)
	{
		System.err.println("invalid phone number or password");
		
	}
	
}
}
