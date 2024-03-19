package org.jsp.assigment1;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.Merchant;

public class FindMerchantbyPhone {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Merchant name to find out:");
	String name = sc.next();
	
	Query q = manager.createQuery("Select m from Merchant m where m.name = ?1");
	
	q.setParameter(1,name);
	List<Merchant> merchants  = q.getResultList();
	
	if(merchants.size() >0)
	{
		for(Merchant m:merchants)
		{
			System.out.println("merchants :"+m);
		}
	}
	else
	{
		System.err.println("No Merchant with entered name");
			
		
	}
	
	
	
}
}
