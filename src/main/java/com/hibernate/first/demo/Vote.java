package com.hibernate.first.demo;

import java.util.Date;

public class Vote {

	private int vtid;

	public Vote(int vtid, String pname, Date date, Voter voter) {
		super();
		this.vtid = vtid;
		this.pname = pname;
		this.date = date;
		this.voter = voter;
	}

	public Vote() {

	}

	private String pname;
	private Date date;
	private Voter voter;

	public int getVtid() {
		return vtid;
	}

	public void setVtid(int vtid) {
		this.vtid = vtid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Voter getVoter() {
		return voter;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

}
