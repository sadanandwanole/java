package com.jspiders.jdbcPractice.firsttype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	public static void main(String[] args) {
		
		//load the driver path
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			//create Statement/ prepare Statement
			
			Statement statement=connection.createStatement();
			
			int executeQuery = statement.executeUpdate("delete from student4 where student_id=4");
			
			
//			process the result
			
			System.out.println("DElete ho Gaya");
			
			//close connection
			System.out.println("hello");
			
			
			//delete 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
