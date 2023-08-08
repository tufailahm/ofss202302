package com.training.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class GetAllEmployee {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			  Properties myProps = new Properties();
			  try {
			    FileInputStream fis = new FileInputStream("mydata.properties");
			    myProps.load(fis);
			  } catch (IOException e) {
			    System.out.println("Error: " + e.getMessage());
			  }

			String url = myProps.getProperty("hostName");
			String username = myProps.getProperty("userName");
			String password = myProps.getProperty("password");

			Connection con = DriverManager.getConnection(url, username, password);
			Statement stat = con.createStatement();
			ResultSet res = stat.executeQuery("select * from employees");

			while (res.next()) {

				System.out.print(res.getString(2)+ "  ");
				System.out.println(res.getString("salary"));
			}

			System.out.println("Driver loaded and connection created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			//close res
			//close stat
			//close conn
		}
	}
}