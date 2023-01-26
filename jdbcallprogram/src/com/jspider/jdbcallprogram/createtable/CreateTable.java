package com.jspider.jdbcallprogram.createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		// load driver class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			
			// create or prepare statement
			
			Statement statement=connection.createStatement();
			int executeQuery = statement.executeUpdate("create table emp1 (EmpId Integer, Name varchar(40),Email varchar(40), primary key(EmpId))");
			System.out.println(executeQuery+ " record created");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
