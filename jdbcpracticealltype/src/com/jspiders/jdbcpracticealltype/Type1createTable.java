package com.jspiders.jdbcpracticealltype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;


public class Type1createTable {
	public static void main(String[] args) {
		
		//loas the driver path
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4? user=root & password=root");
			
			//create/prepare statement
			
			Statement statement = connection.createStatement();
			ResultSet executeQuery = statement.executeQuery("select * from sada1");
//			int resultset=statement.executeUpdate("insert into sada1 values('sadanand' , 'Pune'),('aruhi','dahegaon')");
//			int resultset=statement.executeUpdate("delete from sada1 where name='sadanand'");
//			int resultset=statement.executeUpdate("update  sada1 set name='Rakhi' where name='aruhi'");
//		System.out.println("table created succesfully....!!!!");
//			System.out.println(resultset+"rows affected");
			
			//process the result
			
			while (executeQuery.next()) {
				System.out.println(executeQuery.getString(1)+" || "
						+executeQuery.getString(2)+" || ");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
