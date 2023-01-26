package com.jspider.jdbcallprogram.createtable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class InputUserData {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		//load file
		String filePath="E:\\WEJM4\\J2EE\\jdbcallprogram\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			
			//load driver class
			
			Class.forName(properties.getProperty("drivePath"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			
			// create /prepaer statement
			
			PreparedStatement prepareStatement = connection.prepareStatement(properties.getProperty("Query2"));
			
			System.out.println("Enter Your Name");
			String name=scanner.nextLine();
			prepareStatement.setString(1, name);
			
			
			System.out.println("Enter Your Gender");
			String Gender=scanner.nextLine();
			prepareStatement.setString(2, Gender);
			
			
			int executeQuery = prepareStatement.executeUpdate();
			
			System.out.println(executeQuery+ " rows affected");
			
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
