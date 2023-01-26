package com.jspiders.jdbcPractice.secondway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondWay {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4","root","root");
			
			//create Statement/ prepare Statement
			
			Statement statement=connection.createStatement();
			
			int executeQuery = statement.executeUpdate("delete from student4 where student_id=3");
			
			
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
