package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHQL {
	public static void main(String args[]) {
		UserDetails1 u1=new UserDetails1();
//		u1.setUserId(2);
//		u1.setUserName("user2");
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		
		s1.beginTransaction();
		Query q1=s1.createQuery("from UserDetails1");
		List users=q1.list();
		s1.getTransaction().commit();
		s1.close();
		System.out.println("The number of user is: "+users.size());
	}

}
