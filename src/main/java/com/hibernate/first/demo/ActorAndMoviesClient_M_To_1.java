package com.hibernate.first.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ActorAndMoviesClient_M_To_1 {

	
	// one-to-one
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
//		cfg.configure("src/main/resources/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
		
		Actor_01 a=new Actor_01();
		a.setAid(1);
		a.setName("kathir");
		
		Movies_01 m1=new Movies_01();
		m1.setMid(101);
		m1.setName("Lagan");
		m1.setActor(a);
		
		Movies_01 m2=new Movies_01();
		m2.setMid(102);
		m2.setName("PK");
		m2.setActor(a);
		
	
		
		session.save(m1);
		session.save(m2);
		session.save(a);
		
		t.commit();
		System.out.println("successfully saved...");
	}

}
