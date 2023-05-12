package com.hibernate.first.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VoterAndVoteClient_1_to_1 {

	
	// one-to-one
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
//		cfg.configure("src/main/resources/hibernate.cfg.xml");


		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
	
		Transaction t = (Transaction) session.beginTransaction();
		
	   Voter voter=new Voter();
	   voter.setVid(101);
	   voter.setVname("kavin");
	   voter.setVage(23);
	   
	   Vote vote=new Vote();
	   vote.setPname("BDP");
	   vote.setDate(new Date());
	   vote.setVoter(voter);
	   
	   Vote vote1=new Vote();
	   vote1.setPname("BDP");
	   vote1.setDate(new Date());
	   vote1.setVoter(voter);
	   
	   session.save(voter);
	   session.save(vote);
//	   session.save(vote1);
	   
		t.commit();
		System.out.println("successfully saved...");
	}

}
