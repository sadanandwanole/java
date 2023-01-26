package com.jspider.jdbcallprogram.createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
		//load the class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			// create statement or prepare statement
			
			Statement statement=connection.createStatement();
			int executeQuery = statement.executeUpdate("insert into sada values('sadanand wanole','Male')");
			
			System.out.println(executeQuery+ "rows affected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
