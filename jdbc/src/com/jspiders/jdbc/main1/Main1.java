package com.jspiders.jdbc.main1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
	public static void main(String[] args) {
//		//step 1: Lode Driver Class
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			
//			
//			//Step 2: Open Connection
//			
//			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root&password=root");
//			
//			
//			
//			//Step 3: Create / preaper statements
//			
//			Statement statement=connection.createStatement();
//			
//			ResultSet executeQuery = statement.executeQuery("select * from student4");
//			
//			//step 4: process the result
//			
//			while (executeQuery.next()) {
//				System.out.println(executeQuery.getInt(1)+" | "
//						+ executeQuery.getString(2)+" | "
//								+ executeQuery.getString(3)+" | "
//										+ executeQuery.getString(4));
//			}
//			
//			connection.close();
//			statement.close();
//			executeQuery.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
		
		// Step 1: load the Driver Class
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			//Step 2: Open Connection
//			
//			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root&password=root");
//			
//			//Step 3: create / preapare Statement
//			
//			Statement statement =connection.createStatement();
//			ResultSet executeQuery = statement.executeQuery("select * from student4");
//			
//			//Step 4: Result Operation
//			
//			while (executeQuery.next()) {
//				System.out.println(executeQuery.getInt(1)+" | "
//						+ executeQuery.getString(2)+" | "
//								+ executeQuery.getString(3)+" | "
//										+ executeQuery.getString(4)+" | ");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
		// Step 1: Load the Driver Class
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			//Step 2: Open Connection
//			
//			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
//			
//			
//			// Step 3: create / preapare statements
//			
//			Statement statement=connection.createStatement();
//			ResultSet executeQuery = statement.executeQuery("select * from student4");
//			
//			// Step 4: process result
//			while (executeQuery.next()) {
//				System.out.println(executeQuery.getInt(1)+" | "
//						+ executeQuery.getString(2)+" | "
//								+ executeQuery.getString(3)+ " | "
//										+ executeQuery.getString(4));
//			}
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
		//Step 1: Load The Driver Class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2: Open Connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root&password=root");
			
			//Step 3: create / prepare Statements
			
			Statement statement=connection.createStatement();
			ResultSet executeQuery = statement.executeQuery("select * from student4");
			
			//Step 4: result process
			while (executeQuery.next()) {
				System.out.println(executeQuery.getInt(1)+" | "
						+ executeQuery.getString(2)+" | "
								+ executeQuery.getString(3)+" | "
										+ executeQuery.getString(4)+" | ");
			}
			//step 5:close connection
			connection.close();
			statement.close();
			executeQuery.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
