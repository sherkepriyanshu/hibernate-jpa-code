package Composite_key;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchUserByPrimaryKey {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	UserId userid = new UserId();
	userid.setEmail("xyz@gmail.com");
	userid.setPhone(7047678768L);
	
	User u = manager.find(User.class, userid);
	
	if(u !=null)
	{
		System.out.println(u);
		
	}
	else
	{
		System.out.println("Invalid Phone Number or Email");
	}
	
			
}
}
