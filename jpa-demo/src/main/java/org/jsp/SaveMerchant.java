package org.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMerchant {
	public static void main(String[] args) {
		Merchant m = new Merchant();
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the name : ");
		m.setName(sc.next());
		System.out.println("Enter the gst_no : ");
		m.setGst_number(sc.next());
		System.out.println("Enter the phone : ");
		m.setPhone(sc.nextLong());
		System.out.println("Enter the email : ");
		m.setEmail(sc.next());
		System.out.println("Enter the password : ");
		m.setPassword(sc.next());

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");

		EntityManager manager= factory.createEntityManager();
		manager.persist(m);
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("Saved "+m.getId());




	}
}
