package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployee {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String username = "harry";
			String password = "porter";

			String query = "update employees set salary =26000 where employee_id = 1987";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stat = con.createStatement();
			int res = stat.executeUpdate(query);
			System.out.println(res + " row(s) updated");
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
