package one_to_one_uni;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindCardByNumberAndDob {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number and DateOfBirth (YYYY-MM-DD");
	String number = sc.next();
	LocalDate dob = LocalDate.parse(sc.next());
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("developement");
	EntityManager manager = factory.createEntityManager();
	Query q = manager.createQuery("Select c from Pancard c where c.number=?1 and c.dob=?2");
	q.setParameter(1, number);
	q.setParameter(2, dob);
	
	try
	{
		Pancard card = (Pancard) q.getSingleResult();
		System.out.println(card);
		
	}
	catch (NoResultException e)
	{
		System.err.println("Invalid Pancard no or Data of Birth");
	}
	
	
}
}
