package com.sonata;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestLifeCycle {
	public static void main(String[] args) {
		
		UserObject u1= new UserObject();
		u1.setUserName("abc");
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s= factory.openSession();
		s.beginTransaction();
		//persisted
		u1.setUserName("updated user");
		s.save(u1);
		
		u1.setUserName("updated user1");
		s.getTransaction().commit();
		s.close();	
		
		//detached
		u1.setUserName("updated user2");	
	}
}

