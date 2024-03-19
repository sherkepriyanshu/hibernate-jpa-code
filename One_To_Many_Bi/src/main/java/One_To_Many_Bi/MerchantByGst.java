package One_To_Many_Bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MerchantByGst {
	public static void main(String[] args) {
		
		String gst = "ABCD12344";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createQuery("Select m from Merchant m where m.gst_number=?1");
		q.setParameter(1,gst);
		try
		{
			Merchant m = (Merchant) q.getSingleResult();
			System.out.println(m);
			manager.getTransaction().commit();;		}
		catch (NoResultException e)
		{
			System.out.println("Invlaid Merchant id");
		}
	}
}
