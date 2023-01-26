package com.jspiders.jdbcpracticealltype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Type2AllOperation {
	public static void main(String[] args) {
		//load the diver class
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			//opne connection 
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4","root","root");
			
			//prepare statement /create statement
			
			Statement statement=connection.createStatement();
//			ResultSet resultSet=statement.executeQuery("select * from sada1");
//			int result=statement.executeUpdate("insert into sada1 values('kedar','pune'),('manish','Nanded')");
//			int result=statement.executeUpdate("update sada1 set name='dhanashree' where name='kedar' ");
			int result=statement.executeUpdate("delete from sada1 where name='manish'");
			
			//process the result
			System.out.println(result+"rows afeected");
			
//			while (resultSet.next()) {
//				System.out.println(resultSet.getString(1)+ "  || "
//						+resultSet.getString(2)+ "  || ");
//			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
