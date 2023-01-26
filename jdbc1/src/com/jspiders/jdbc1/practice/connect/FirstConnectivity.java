package com.jspiders.jdbc1.practice.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstConnectivity {
	private static Connection connection;
	
	private static Statement createStatement;
	
	private static ResultSet executeQuery;
	
	public static void main(String[] args) {
		// load the driver path
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// open connection
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			// creste stement / prapare statement
			
			createStatement = connection.createStatement();
			
			executeQuery = createStatement.executeQuery("select * from student");
			
			// result process
			
			while (executeQuery.next()) {
				System.out.println(executeQuery.getString(1)+ " || "
						+executeQuery.getString(2)+ " || "
						+executeQuery.getString(3)+ " || "
						+executeQuery.getString(4));
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
			if (connection != null) {
					connection.close();
			}
			if (createStatement !=null) {
				createStatement.close();
			}
			if (executeQuery !=null) {
				executeQuery.close();
			}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

