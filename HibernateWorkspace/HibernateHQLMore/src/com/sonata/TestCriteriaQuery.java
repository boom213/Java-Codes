package com.sonata;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class TestCriteriaQuery {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		Criteria criteria = s1.createCriteria(UserDetails1.class);
		criteria.add(Restrictions.eq("userName","user2")); 
		
		@SuppressWarnings("unchecked")
		List<UserDetails1> users  = (List<UserDetails1>)criteria.list();
		
		s1.getTransaction().commit();
		s1.close();
		for(UserDetails1 u : users) {
		System.out.println(u.getUserId());
		System.out.println(u.getUserName());
		}
	}
}