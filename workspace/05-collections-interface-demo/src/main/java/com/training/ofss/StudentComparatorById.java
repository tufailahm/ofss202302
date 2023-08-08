package com.training.ofss;

import java.util.Comparator;

public class StudentComparatorById implements Comparator<Student> {
	public StudentComparatorById() {
	}
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getId() > o2.getId())
			return -1;
		else
			return 1;
	}

}
