package org.jsp.merchantproductapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.merchantproductapp.dto.Merchant;

public class MerchantDao {

	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	
	public Merchant saveMerchant(Merchant merchant)
	{
		EntityTransaction transcation = manager.getTransaction();
		manager.persist(merchant);
		transcation.begin();
		transcation.commit();
		return merchant;
		
		
	}
	
	
	public Merchant updateMerchant(Merchant merchant)    //detached state
	{
		EntityTransaction transcation = manager.getTransaction();
		Merchant dbmerchant  = findMerchantById(merchant.getId());//persist state
		if(dbmerchant !=null)
		{
			dbmerchant.setName(merchant.getName());
			dbmerchant.setGst_number(merchant.getGst_number());
			dbmerchant.setPassword(merchant.getPassword());
			dbmerchant.setPhone(merchant.getPhone());
			dbmerchant.setEmail(merchant.getEmail());
			transcation.begin();
			transcation.commit();
		return dbmerchant;
		}
		else
		{
			return null;
		}
	}
	
	public Merchant findMerchantById(int id)
	{
		return manager.find(Merchant.class, id);
				
	
	}
	
	public Merchant verfiy(long phone,String password)
	{
		
		Query q = manager.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try
		{
			return (Merchant) q.getSingleResult();
		}
		catch (NoResultException e)
		{
			return null;
		}
	}
	
	public Merchant verfiy(String email,String password)
	{
		Query q = manager.createQuery("select m from Merchant m where m.email=?1 and m.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		try
		{
			return (Merchant) q.getSingleResult();
		}
		catch (NoResultException e)
		{
			return null;
		}
	}
	
	
}
