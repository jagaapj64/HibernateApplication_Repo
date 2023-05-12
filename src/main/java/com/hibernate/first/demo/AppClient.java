package com.hibernate.first.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.RollbackException;

public class AppClient {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
//		cfg.configure("src/main/resources/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();

		OldStudent oldStudent1=new OldStudent(101, "guru", 100);
		OldStudent oldStudent2=new OldStudent(102, "jai", 90);
		OldStudent oldStudent3=new OldStudent(103, "kathir", 60);
		
		session.saveOrUpdate(oldStudent1);
		session.saveOrUpdate(oldStudent2);
		session.saveOrUpdate(oldStudent3);
		try {
			t.commit();
		} catch (SecurityException | IllegalStateException | RollbackException e) {
			e.printStackTrace();
		}
		System.out.println("successfully saved");

		factory.close();
		session.close();
	}
}
