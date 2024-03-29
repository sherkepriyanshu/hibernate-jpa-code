package org.jsp.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindByUsingGet {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int Id = sc.nextInt();
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		
		Employee e = s.get(Employee.class,Id);
	 if(e!=null)
	 {
		 System.out.println("Employee Id :"+Id);
		 System.out.println("Employee Name"+e.getName());
		 System.out.println("Employee Phone Number :"+e.getPhone());
		 System.out.println("Employee Salary:"+e.getSalary());
		 System.out.println("Employee Desgination:"+e.getDesg());
		 
	 }
	 else
	 {
		 System.err.println("You have entered an Invalid Employee id");
	 }
	}

	
}
