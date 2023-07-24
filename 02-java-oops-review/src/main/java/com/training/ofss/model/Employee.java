package com.training.ofss.model;

import java.util.Objects;

public class Employee extends Object{
	private int empId;
	private String name;
	private String ssn;		
	private double salary;

	public Employee() {
	}
	
	public Employee(int empId, String name, String ssn, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, name, salary, ssn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(ssn, other.ssn);
	}
	
	
}

