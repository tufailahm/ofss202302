package com.training.ofss.entity;

import com.training.ofss.model.Employee;

public class Manager extends Employee{
	
	String departmentName;
	
	
	public Manager(int empId, String name, String ssn, double salary,String departmentName) {
		super(empId, name, ssn, salary);
		this.departmentName = departmentName;
	}


	public Manager() {
		// TODO Auto-generated constructor stub
	}


	public void display() {
		System.out.println(super.getName());
	}


	@Override
	public String toString() {
		return "Manager [departmentName=" + departmentName + ", getEmpId()=" + getEmpId() + ", getName()=" + getName()
				+ ", getSsn()=" + getSsn() + ", getSalary()=" + getSalary() + "]";
	}
	
	
}