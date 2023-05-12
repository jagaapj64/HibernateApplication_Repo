package com.hibernate.first.demo;

import java.util.Set;

public class Faculty {

	private int fid;

	public Faculty(int fid, String fname, int exp, Set<Courses> course) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.exp = exp;
		this.course = course;
	}

	public Faculty() {

	}

	private String fname;
	private int exp;
	private Set<Courses> course;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Set<Courses> getCourse() {
		return course;
	}

	public void setCourse(Set<Courses> course) {
		this.course = course;
	}

}
