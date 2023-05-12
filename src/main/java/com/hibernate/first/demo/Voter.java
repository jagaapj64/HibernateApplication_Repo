package com.hibernate.first.demo;

public class Voter {
	private int vid;
	private String vname;
	private int vage;
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public int getVage() {
		return vage;
	}

	public void setVage(int vage) {
		this.vage = vage;
	}

	
	public Voter(int vid, String vname, int vage) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vage = vage;
	}
	
	public Voter() {

	}
	
	
}
