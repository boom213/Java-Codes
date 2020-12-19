package com.sonata;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestCustomer {
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustName("Jay");
		c1.setCustAddress("Jay");
		c1.setCreditScore(700);
		c1.setRewardPoint(1000);
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		s1.beginTransaction();
		s1.save(c1);
		s1.getTransaction().commit();
		s1.close();	
	}
}

