package org.jsp.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		Employee e= s.get(Employee.class, 6);
		Transaction t=s.beginTransaction();
	 if(e!=null)
	 {
		 e.setName("Priyan");
			e.setDesg("SofEngineer");
			e.setPassword("ri@123");
			e.setPhone(8763345632L);
			e.setSalary(50000);
			t.commit();
	 }
	 else
	 {
		 System.err.println("Invalid ID");
	 }
	}
}
