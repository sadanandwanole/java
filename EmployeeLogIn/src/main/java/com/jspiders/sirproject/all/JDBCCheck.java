package com.jspiders.sirproject.all;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCheck {
	public static void main(String[] args) {
		
		//load the driver path
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?","root","root");
			PreparedStatement prepareStatement = connection.prepareStatement("insert into admin values (?,?)");
			prepareStatement.setString(1, "sada");
			prepareStatement.setString(2, "sada@123");
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate+"rows affected...!!!!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
