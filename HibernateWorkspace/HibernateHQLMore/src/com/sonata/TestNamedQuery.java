package com.sonata;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

public class TestNamedQuery {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		s1.beginTransaction();
		//Calling Named query
		Query query=s1.getNamedQuery("getUserDetails.byId");
		query.setInteger(0,3);
		
//		Query query=s1.getNamedQuery("getUserDetails.byName");
		
		List<UserDetails1> users= (List<UserDetails1>)query.list();
		s1.getTransaction().commit();
		s1.close();
		for(UserDetails1 u: users)
		{
			System.out.println(u.getUserId());
			System.out.println(u.getUserName());
		}
	}
}
