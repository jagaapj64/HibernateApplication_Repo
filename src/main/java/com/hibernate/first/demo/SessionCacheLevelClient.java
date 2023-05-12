package com.hibernate.first.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionCacheLevelClient {

	// one-to-one
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
//		cfg.configure("src/main/resources/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session  session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
//
//		Student s1 = new Student(10, "Kathir", "Java");
//		Student s2 = new Student(20, "Guru", "Spring");
//		Student s3 = new Student(30, "Mani", "Hibernate");
//		Student s4 = new Student(40, "Kavin", "JPA");

//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
		t.commit();

		Student st1 = session.get(Student.class, 20);

		System.out.println("sname :" + st1.getSname());
		System.out.println("sname :" + st1.getCourse());

		Student st2 = session.get(Student.class, 20);

		System.out.println("sname :" + st2.getSname());
		System.out.println("sname :" + st2.getCourse());
		
		Session session2 = factory.openSession();
		
		Student st3 = session2.get(Student.class, 20);

		System.out.println("sname :" + st1.getSname());
		System.out.println("sname :" + st1.getCourse());


		System.out.println("successfully saved...");
	}

}
