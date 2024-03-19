package one_to_one_bi;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Saved {

	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		
		User user = new User();
		user.setName("Priyanshu");
		user.setPhone(7047678768L);
		
		AadharCard card = new AadharCard();
		card.setNumber(123412341234L);
		card.setDob(LocalDate.parse("2002-08-13"));
		
		
		
		
	}
}
