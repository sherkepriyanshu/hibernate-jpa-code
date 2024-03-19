package org.jsp.assigment1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllEmails {
	public static void main(String[] args) {
		 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		
		Query q = manager.createQuery("select m.email from Merchant m");
		
		List<String> email=q.getResultList();
		if(email.size()>0) {
		for(String ph : email)
		{
			System.out.println(ph);
		}
		
		}
		else
		{
			System.err.println("Zero Email Found");
		}
		}
}
