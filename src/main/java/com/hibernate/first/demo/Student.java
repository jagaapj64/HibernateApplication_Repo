package com.hibernate.first.demo;

public class Student {

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	private int sid;
	public Student(int sid, String sname, String course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	public Student() {
		
	}
	private String sname;
	private String course;
}
