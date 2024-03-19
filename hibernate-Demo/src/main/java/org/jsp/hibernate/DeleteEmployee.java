package org.jsp.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {
public static void main(String[] args) {
	
	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session s = factory.openSession();
	Employee e = s.get(Employee.class,1);
	if(e!=null)
	{
		s.delete(e);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println("deleted");
	}
	else
	{
		System.err.println("Cannot delete as ID is Invlaid");
	}
}
}
