package com.hibernate.first.demo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultyAndCoursesClient_M_To_M {

	// one-to-one
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
//		cfg.configure("src/main/resources/hibernate.cfg.xml");


		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();

		Courses c1 = new Courses();
		c1.setCid(11);
		c1.setCname("Spring");
		c1.setFee(3000);

		Courses c2 = new Courses();
		c2.setCid(12);
		c2.setCname("Hibernate");
		c2.setFee(4000);

		Courses c3 = new Courses();
		c3.setCid(13);
		c3.setCname("Spring Boot");
		c3.setFee(5000);

		Courses c4 = new Courses();
		c4.setCid(14);
		c4.setCname("React");
		c4.setFee(5000);

		Set<Courses> set1 = new HashSet<>();
		set1.add(c1);
		set1.add(c2);

		Set<Courses> set2 = new HashSet<>();

		set2.add(c2);
		set2.add(c3);
		set2.add(c4);

		Faculty f1 = new Faculty();
		f1.setFid(100);
		f1.setFname("Guru");
		f1.setExp(10);
		f1.setCourse(set1);

		Faculty f2 = new Faculty();
		f2.setFid(101);
		f2.setFname("Kathir");
		f2.setExp(11);
		f2.setCourse(set2);
		
		Faculty f3 = new Faculty();
		f3.setFid(103);
		f3.setFname("Mani");
		f3.setExp(4);
		f3.setCourse(set1);

		session.saveOrUpdate(f1);
		session.saveOrUpdate(f2);
		session.saveOrUpdate(f3);
		session.saveOrUpdate(c1);
		session.saveOrUpdate(c2);
		session.saveOrUpdate(c3);
		session.saveOrUpdate(c4);

		t.commit();
		session.close();
		System.out.println("successfully saved...");
	}

}
