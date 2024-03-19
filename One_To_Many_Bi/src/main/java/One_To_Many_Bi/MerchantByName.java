package One_To_Many_Bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MerchantByName {
	public static void main(String[] args) {
		
	String name = "ABBB";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createQuery("Select m from Merchant m where m.name=?1");
		q.setParameter(1, name);
		try
		{
			Merchant m = (Merchant) q.getSingleResult();
			System.out.println(m);
		}
		catch (NoResultException e)
		{
			System.out.println("Invlaid Merchant id");
		}
	}
}
