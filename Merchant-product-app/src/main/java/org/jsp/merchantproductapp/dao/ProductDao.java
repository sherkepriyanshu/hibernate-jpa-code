package org.jsp.merchantproductapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.merchantproductapp.dto.Merchant;
import org.jsp.merchantproductapp.dto.Product;

public class ProductDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	
	
	public Product saveProduct(Product product, int merchant_id)
	{
		EntityTransaction transcation = manager.getTransaction();
		Merchant merchant = manager.find(Merchant.class, merchant_id);
		
		
		if(merchant!=null)
			
		{	
			manager.persist(product);
			transcation.begin();
			transcation.commit();
			return product;
		}
		else 
		{
			return null;
		}
		}
}
