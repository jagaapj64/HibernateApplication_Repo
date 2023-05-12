package com.hibernate.first.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClient {
	
	// table per class and table per subclass
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	Configuration cfg = new Configuration().configure();
//	cfg.configure("src/main/resources/hibernate.cfg.xml");


	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = (Transaction) session.beginTransaction();
	
	SoftwareEmployee se=new SoftwareEmployee(11, "guru", "guru@gmail.com", 40000, "postman");
	HardwareEmployee he=new HardwareEmployee(12, "kathir", "kathir@gmail.com", 20000, "PC");
	AdminEmployee ae=new AdminEmployee(3, "kavin", "kavin@gmail.com", 35000, "chennai");
	
	session.save(se);
	session.save(he);
	session.save(ae);
	t.commit();
	
	System.out.println("successfully saved...");
	session.close();
	}
	
	
}
