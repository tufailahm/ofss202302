package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllEmployee_TryWithResources {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String username = "harry";
		String password = "porter";
		 try {
		        try (Connection con = DriverManager.getConnection(url,username,password);
		             Statement ps = con.createStatement();) {
		          
		            try (ResultSet rs = ps.executeQuery("select *from employees");) {
		                while(rs.next()) {
		                	System.out.print(rs.getString(2)+ "  ");
		        			System.out.println(rs.getString("salary"));
		                }
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
				
		
	}

}
