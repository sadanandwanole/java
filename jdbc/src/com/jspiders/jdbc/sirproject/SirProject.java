package com.jspiders.jdbc.sirproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SirProject {
	private static String driverPath="com.mysql.cj.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/wejm4?user=root & password=root";
	
	public static void main(String[] args) {
		// create a table
		
		//Step 1: load the driver class
		
		try {
			Class.forName(driverPath);
			// open Connection
			Connection connection=DriverManager.getConnection(dburl);
			//create / prapare Statement
			Statement statement=connection.createStatement();
			int executeQuery = statement.executeUpdate("create table students1 (id integer, Roll_No  integer, name varchar(40), contact integer(12))");
			//int executeQuery = statement.executeUpdate("insert into student5 values(1, 20, 'sham', 787878),(2, 34,'sada', 7898),(3, 40, 'aru' , 90909),(4,50,'nehanam',90909),(5,60,'chiku123',888888)");
			
			
			// update 2 record 
			
			//			statement.executeUpdate("update student5 set name='sadanand' where id=1");
			//			statement.executeUpdate("update student5 set id=10 where id=1");
			
			//statement.executeUpdate("delete from student5 where id=2");
			ResultSet executeQuery2 = statement.executeQuery("select * from student5");
			System.out.println("table created");
			//display all records
			while (executeQuery2.next()) {
				System.out.println(executeQuery2.getString(1)+" || "
						+ executeQuery2.getString(1)+" || "+
						executeQuery2.getString(2)+" || "+
						executeQuery2.getString(3)+" || "+
						executeQuery2.getString(4)+" || ");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	

}
