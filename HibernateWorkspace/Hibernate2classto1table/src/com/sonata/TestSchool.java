package com.sonata;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestSchool {
	
	public static void main(String[] args) {

		
		School_Details s2 = new School_Details();
		s2.setPublic(true);
		s2.setSchoolAddress("Greater Noida");
		s2.setStudentCount(1000);
		
		School sc = new School();
		sc.setSchoolName("DPS");
		sc.setSchDetails(s2);
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		s1.beginTransaction();
		s1.save(sc);
		s1.getTransaction().commit();
		s1.close();			
	}
}
