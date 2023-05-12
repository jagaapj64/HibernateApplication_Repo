package com.hibernate.first.demo;

public class Course {

	private int id;
	private String courseName;

	public Course(int i, String string, String string2) {
		this.id = i;
		this.courseName = string;
		this.dept = string2;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
