package com.sonata;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestInheritance {
	public static void main(String[] args) {
		Project p1= new Project();
		p1.setProjectName("Hibernate");
		
		Module m=new Module();
		m.setModuleName("Spring");
		m.setProjectName("AOP");
		
		Task t= new Task();
		t.setTaskName("Arrays");
		t.setProjectName("Java Lesson");
		t.setModuleName("List");
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.save(m);
		s1.save(t);
		s1.getTransaction().commit();
		s1.close();	
	}
}
