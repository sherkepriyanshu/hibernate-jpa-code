package org.jsp.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Employee e = new Employee(); //Transient state
		e.setId(7);
			e.setName("Pushpa");
		e.setDesg("JAVA Developer");
			e.setSalary(12000);
			e.setPhone(7047678700L);
			e.setPassword("srivalli2");
		s.update(e); //s.saceOrUpdate(e)
		Transaction t = s.beginTransaction();
		t.commit();
	}
}
