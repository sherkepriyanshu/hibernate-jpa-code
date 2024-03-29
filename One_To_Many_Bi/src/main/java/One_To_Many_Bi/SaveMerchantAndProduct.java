package One_To_Many_Bi;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMerchantAndProduct {

	public static void main(String[] args) {
		Merchant m = new Merchant();
		m.setGst_number("ABCD12355");
		m.setName("ABBB");
		m.setPhone(7047678786L);
		m.setPassword("abbb");
		
		Merchant m1 = new Merchant();
		m1.setGst_number("ABCD12356");
		m1.setName("ABCD");
		m1.setPhone(7047678768L);
		m1.setPassword("abcd");
		
		Product p= new Product();
		p.setBrand("Samsung");
		p.setName("SmartPhone");
		p.setCategory("Electronics");
		p.setDescription("6GB RAM");
		p.setCost(13500);
		p.setMerchant(m);
		p.setMerchant(m1);

		Product p2= new Product();
		p2.setBrand("Realme");
		p2.setName("SmartPhone");
		p2.setCategory("Electronics");
		p2.setDescription("8GB RAM");
		p2.setCost(16000);
		p2.setMerchant(m);
		
		m.setProduct(Arrays.asList(p,p2));
		m1.setProduct(Arrays.asList(p));
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		manager.persist(m);
		manager.persist(m1);
		transaction.begin();
		transaction.commit();
		
	}
}
