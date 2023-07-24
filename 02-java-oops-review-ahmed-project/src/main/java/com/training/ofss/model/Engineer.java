package com.training.ofss.model;

public class Engineer extends Employee{
	
	String branch;
	
	
	public Engineer(int empId, String name, String ssn, double salary,String departmentName) {
		super(empId, name, ssn, salary);
		this.branch = departmentName;
	}

	public void display() {
		System.out.println(super.getName());
	}


	@Override
	public String toString() {
		return "Engineer [branchName=" + branch + ", getEmpId()=" + getEmpId() + ", getName()=" + getName()
				+ ", getSsn()=" + getSsn() + ", getSalary()=" + getSalary() + "]";
	}
	
	
}