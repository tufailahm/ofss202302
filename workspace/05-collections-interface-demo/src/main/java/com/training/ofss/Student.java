package com.training.ofss;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private long id;
	private double gpa;
	@Override
	public int compareTo(Student o) {
        int result = this.name.compareTo(o.getName());
		if(result >0)
			return 1;
		else
			return -1;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, long id, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gpa, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa) && id == other.id
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}



	
}
