package com.training.ofss;

import com.training.ofss.enums.DEPARTMENTS;
import com.training.ofss.exception.NegativeSalaryException;
import com.training.ofss.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e2 = new Employee();
			try {
				e2 = new Employee(1122, "Shubham", "121223", 12);
				e2.setSalary(9000);
			} catch (NegativeSalaryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(e2);
	
		
		/*
		 * try { if (e2 instanceof Manager) { Manager m2 = (Manager) e2;
		 * m2.setName("HR"); System.out.println(m2); } } catch (Exception e1) { // TODO
		 * Auto-generated catch block e1.printStackTrace(); }
		 * 
		 * Employee e = new Employee(); Manager m = new Manager(); e=m; m=(Manager)e;
		 * //explicit
		 */
		System.out.println("Thanks");
	}
	


}
