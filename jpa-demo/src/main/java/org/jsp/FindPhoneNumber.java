package org.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPhoneNumber {
public static void main(String[] args) {
	 
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	
	Query q = manager.createQuery("select m.phone from Merchant m");
	
	List<Long> ph2s=q.getResultList();
	if(ph2s.size()>0) {
	for(long ph : ph2s)
	{
		System.out.println(ph);
	}
	}
	else
	{
		System.err.println("Zero Number Foun2sd");
	}
	}
}

