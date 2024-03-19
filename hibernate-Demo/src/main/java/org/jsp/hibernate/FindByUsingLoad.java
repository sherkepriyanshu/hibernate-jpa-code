package org.jsp.hibernate;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class FindByUsingLoad {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ID");
	int Id = sc.nextInt();
	
	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session s = factory.openSession();

	
	Employee e = s.load(Employee.class,Id);
 try
 {
	 System.out.println("Employee Id :"+Id);
	 System.out.println("Employee Name"+e.getName());
	 System.out.println("Employee Phone Number :"+e.getPhone());
	 System.out.println("Employee Salary:"+e.getSalary());
	 System.out.println("Employee Desgination:"+e.getDesg());
	 
 }
catch (ObjectNotFoundException exc)
 {
	 System.err.println("You have entered an Invalid Employee id");
 }
}
}
