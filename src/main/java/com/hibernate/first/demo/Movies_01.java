package com.hibernate.first.demo;

public class Movies_01 {

	private int mid;
	private String name;
	private Actor_01 actor;

	public Movies_01(int mid, String movieName) {
		super();
		this.mid = mid;
		this.name = movieName;
	}

	public Movies_01() {

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

	public Actor_01 getActor() {
		return actor;
	}

	public void setActor(Actor_01 actor) {
		this.actor = actor;
	}


}
