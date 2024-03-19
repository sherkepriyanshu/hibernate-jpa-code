package org.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMerchant {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Merchant Id to display :");
		
		int id = sc.nextInt();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		
		EntityManager manager = factory.createEntityManager();
		
		Merchant m = manager.find(Merchant.class, id);
		
		
		if(m!=null)
		{
			System.out.println(m);
		}
		else
		{
			System.out.println("You have entered an invalid merchant ");
			
			
		}
		
		m.setPassword("priyanshusherke");
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("updated "+m.getId());
	}
}
