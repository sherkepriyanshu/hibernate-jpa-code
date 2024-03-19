package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOrder {
public static void main(String[] args) {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");

	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
FoodOrder order = manager.find(FoodOrder.class, 1);
order.setCost(200);
order.setFood_item("Pizza");
	
	manager.persist(order);

	transaction.begin();
	transaction.commit();
}
}
