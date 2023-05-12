package com.hibernate.first.demo;

public class Movies {

	public Movies(int mid, String movieName) {
		super();
		this.mid = mid;
		this.name = movieName;
	}
	
	public Movies() {

	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int mid;
	private String name;


}
