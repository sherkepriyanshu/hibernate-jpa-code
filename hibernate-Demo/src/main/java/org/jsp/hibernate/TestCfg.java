package org.jsp.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println(factory);
	}
}