package com.training.ofss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student("Viresh", 9972, 2327.77);
		Student student2 = new Student("Aaksha", 92, 87.77);
		Student student3 = new Student("Yash", 267, 1987.77);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(new Student("Navjot", 2736, 98272.88));
		students.add(new Student("Ahmed", 777, 98761514.88));

		Collections.sort(students);
		System.out.println("Sort by name (asc) ");
		System.out.println(students);
		System.out.println("Sort by id (desc) ");
		Collections.sort(students, new StudentComparatorById());
		System.out.println(students);

		System.out.println("sort by gpa (desc) ::: ");

		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getGpa() > o2.getGpa())
					return -1;
				else
					return 1;
			}
		});
		System.out.println(students);
		
		
		//id desc using lambda 
		Comparator<Student> c1 = (s1,s2) -> s1.getId() > s2.getId() ? -1 :1;
		Collections.sort(students,c1);
		System.out.println("id desc using lambda");
		System.out.println(students);
	
		Collections.sort(students,(s1,s2) -> s1.getId() > s2.getId() ? -1 :1);
		System.out.println("id desc using lambda");
		System.out.println(students);
		
	}
}
