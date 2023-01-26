package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {
	public static void main(String[] args) {
		
		
//		step 1: Load Driver Class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2: Open Connection
			
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			//Step 3:  create /preaper statement
			
			Statement statement=connection.createStatement();
			
			ResultSet executeQuery = statement.executeQuery("select * from student");
			
			// Step 4: process the result
			
			while (executeQuery.next()) {
				System.out.println(executeQuery.getInt(1)+ " | "
						+ executeQuery.getString(2)+ " | "
						+ executeQuery.getString(3)+" | "
						+ executeQuery.getString(4)+ " | ");
			}
			// step 5: close statement
			connection.close();
			statement.close();
			executeQuery.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
