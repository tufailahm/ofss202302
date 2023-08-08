package com.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter empoyee id to update :");
		int empId = scanner.nextInt();

		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String username = "harry";
			String password = "porter";
			Connection con = DriverManager.getConnection(url, username, password);

			CallableStatement cStmt = con.prepareCall("{CALL query_emp (?, ?,?)}");
			cStmt.setInt(1, empId);
			cStmt.registerOutParameter(2,Types.VARCHAR);
			cStmt.registerOutParameter(3,Types.INTEGER);

			cStmt.execute();		//call the procedure
			
			String lname = cStmt.getString(2);
			int salary = cStmt.getInt(3);
			
			System.out.println(empId+ " last name is : "+lname+ " and his salary is :"+salary);
			
			
		} catch (SQLException ex) {
			while (ex != null) {
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("Error Code:" + ex.getErrorCode());
				System.out.println("Message:   " + ex.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause:" + t);
					t = t.getCause();
				}
				ex = ex.getNextException();
			}

		}

	}

}
