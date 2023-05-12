package com.hibernate.first.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.RollbackException;

public class HQL_Insert_Data {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
//		cfg.configure("src/main/resources/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = (Transaction) session.beginTransaction();

		String sql="insert into NewStudent(id,name,marks) select s.id,s.name,s.marks from OldStudent s";
		Query<String> q =session.createQuery(sql);
		int i=q.executeUpdate();
		System.out.println("no of rows dumps to old to new table :"+i);
		
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
