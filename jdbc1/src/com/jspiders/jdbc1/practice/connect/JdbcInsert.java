package com.jspiders.jdbc1.practice.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
		// load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			
			// create or preaper statement
			Statement statement=connection.createStatement();
			int executeUpdate = statement.executeUpdate("insert into student values(4,'rakhi','rakhi@gmail.com',7878909)");
			// process result
			
			System.out.println(executeUpdate+"rows affected");
			
			//close connection
			statement.close();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
