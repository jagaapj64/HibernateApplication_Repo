package com.hibernate.first.demo;

public class AdminEmployee extends Employee {

	private String branch;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public AdminEmployee(int id, String name, String email, int salary, String branch) {
		super(id, name, email, salary);
		this.branch = branch;
	}

}
