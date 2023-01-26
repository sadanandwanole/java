package com.jspiders.jdbc1.practice.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUpdate {
	
	public static void main(String[] args) {
		
		
		// load the Driver Class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			// create / prepare Statement
			
			Statement statement=connection.createStatement();
			int executeUpdate = statement.executeUpdate("update student set id=5 where id=1");
			
			// process result
			System.out.println(executeUpdate+"rows affected");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
