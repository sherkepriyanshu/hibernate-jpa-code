package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PlaceOrder {
public static void main(String[] args) {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");

	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	FoodOrder order = new FoodOrder();
	order.setFood_item("Butter Naan");
	order.setCost(150);
manager.persist(order);
	transaction.begin();
	transaction.commit();
}
}
