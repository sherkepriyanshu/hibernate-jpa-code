package org.jsp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.setName("Asif");
		e.setDesg("Infinite Developer");
		e.setPassword("asif@gmail.com");
		e.setPhone(7047678712L);
		e.setSalary(35000);
		
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction t=s.beginTransaction();
		int id=(Integer)s.save(e);
		t.commit();
		System.out.println("Employee saved with ID: "+id);
	}

}