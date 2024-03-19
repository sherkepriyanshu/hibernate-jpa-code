package One_To_Many_Bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MerchantByProductId {
	public static void main(String[] args) {
		
		int id = 1;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createQuery("Select p.merchant_id  from Product p where p.id=?1");
		Query q2 = manager.createQuery("Select m from Merchant m where m.id=?1");
		q.setParameter(1, id);
		try
		{
			Integer a = 
		}
		catch (NoResultException e)
		{
			System.err.println("Invlaid Merchant id");
		}
	}
}
