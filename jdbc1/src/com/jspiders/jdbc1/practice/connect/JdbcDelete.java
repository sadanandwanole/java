package com.jspiders.jdbc1.practice.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {
	public static void main(String[] args) {
		// load the Driver Class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Open Connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			// create statement / prepare statement
			
			Statement statement=connection.createStatement();
			int executeQuery = statement.executeUpdate("delete from student where id=4");
			
			// process the result
			
			System.out.println(executeQuery+"rows affected");
			
			//
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
