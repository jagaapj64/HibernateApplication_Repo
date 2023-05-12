package com.hibernate.first.demo;

public class Actor_01 {

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int aid;

	private String name;

	public Actor_01(int aid, String actorName) {
		super();
		this.aid = aid;
		this.name = actorName;

	}

	public Actor_01() {

	}

}
