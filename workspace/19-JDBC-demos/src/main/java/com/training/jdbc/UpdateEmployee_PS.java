package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEmployee_PS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter empoyee id to update :");
		int empId = scanner.nextInt();
		
		System.out.println("Enter new salary for "+empId);
		int newSalary = scanner.nextInt();
		
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String username = "harry";
			String password = "porter";

			String query = "update employees set salary = ? where employee_id = ?";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stat = con.prepareStatement(query);
			stat.setInt(1, newSalary);
			stat.setInt(2, empId);
			
			int res = stat.executeUpdate();
			System.out.println(res + " row(s) updated");
			

		} catch (SQLException ex) {
			while(ex != null) {
		         System.out.println("SQLState:  " + ex.getSQLState());
		         System.out.println("Error Code:" + ex.getErrorCode());
		         System.out.println("Message:   " + ex.getMessage());
		         Throwable t = ex.getCause();
		         while(t != null) {
		             System.out.println("Cause:" + t);
		             t = t.getCause();
		         }
		         ex = ex.getNextException();
		    }

		}

	}

}
