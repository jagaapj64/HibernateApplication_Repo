package com.hibernate.first.demo;

import java.util.Set;

public class Courses {

	private int cid;

	public Courses(int cid, String cname, int fee, Set<Faculty> faculties) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fee = fee;
		this.faculties = faculties;
	}

	public Courses() {

	}

	private String cname;
	private int fee;
	private Set<Faculty> faculties;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Set<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(Set<Faculty> faculties) {
		this.faculties = faculties;
	}

}
