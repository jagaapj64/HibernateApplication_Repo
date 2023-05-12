package com.hibernate.first.demo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ActorAndMoviesClient_1_To_M {

	
	// one-to-one
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
//		cfg.configure("src/main/resources/hibernate.cfg.xml");


		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();
		
		Actor a=new Actor();
		a.setAid(1);
		a.setName("kathir");
		
		Movies m1=new Movies();
		m1.setMid(101);
		m1.setName("Lagan");
		
		Movies m2=new Movies();
		m2.setMid(102);
		m2.setName("PK");
		
		Set<Movies> set=new HashSet<Movies>();
		set.add(m1);
		set.add(m2);
		
		a.setMoive(set);
		
//		session.save(m1);
//		session.save(m2);
		session.save(a);
		
		t.commit();
		System.out.println("successfully saved...");
	}

}
