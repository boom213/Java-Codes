package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestEmp {
	public static void main(String args[]) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1=factory.openSession();
		s1.beginTransaction();
		Query q1=s1.createQuery("from Employee"); //HQL
		List users=q1.list();
		s1.getTransaction().commit();
		s1.close();
		System.out.println("The size of Emp table is:"+users.size());
		
	}

}

