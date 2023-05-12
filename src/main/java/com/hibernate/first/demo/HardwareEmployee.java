package com.hibernate.first.demo;

public class HardwareEmployee extends Employee {

	public HardwareEmployee(int id, String name, String email, int salary, String device) {
		super(id, name, email, salary);
		this.device = device;
	}

	private String device;

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

}
