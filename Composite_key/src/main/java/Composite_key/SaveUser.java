package Composite_key;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		
		UserId userid = new UserId();
		userid.setEmail("xyz@gmail.com");
		userid.setPhone(7047678768L);
		
		User user = new User();
		user.setName("Priyanshu");
		user.setPassword("abc@123");
		user.setUserId(userid);
		
		
		manager.persist(user);
		transaction.begin();
transaction.commit();
		
	}
}
