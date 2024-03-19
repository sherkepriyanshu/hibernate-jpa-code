package org.jsp.hibernate;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindALLEmpployee {
public static void main(String[] args) {
	Session s = new Configuration().configure().buildSessionFactory().openSession();
	Query<Employee> q  = s.createQuery("select e from Employee e");
	List<Employee> emps = q.getResultList();
	if(emps.size()>0)

{
	for(Employee e:emps)
	{
		System.out.println("Employee name :"+e.getName());
	}
}
else
{
	System.err.println("No Employee Present");
}
}
}
