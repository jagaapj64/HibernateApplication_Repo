package com.hibernate.first.demo;

import java.util.Set;

public class Actor {

	private int aid;
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

	public Set<Movies> getMoive() {
		return moive;
	}

	public void setMoive(Set<Movies> moive) {
		this.moive = moive;
	}

	private String name;
	private Set<Movies> moive;

	public Actor(int aid, String actorName, Set<Movies> moives) {
		super();
		this.aid = aid;
		this.name = actorName;
		this.moive = moives;
	}
	
	public Actor() {
		
	}

	


	
}
