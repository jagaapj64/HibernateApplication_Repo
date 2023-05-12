package com.hibernate.first.demo;

public class SoftwareEmployee extends Employee {

	public SoftwareEmployee(int id, String name, String email, int salary, String tools) {
		super(id, name, email, salary);
		this.tools = tools;
	}

	private String tools;
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	
	

}
