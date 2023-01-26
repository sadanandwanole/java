package com.jspiders.jdbcdynamic.insert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class jdbcInsert3 {
	
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// lode the prorties
		
		String filePath="E:\\WEJM4\\J2EE\\jdbcdynamic\\resources\\db_info.properties";
		
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			
			// load the driver class
			
			Class.forName(properties.getProperty("driverPath"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			
			//create or prepare statement
			
			PreparedStatement prepareStatement = connection.prepareStatement(properties.getProperty("Query"));
			
			System.out.println("Enter Student Id: ");
			int id=scanner.nextInt();
			prepareStatement.setInt(1, id);
			
			System.out.println("Enter Student name: ");
			String name=scanner.next();
			prepareStatement.setString(2, name);
			
			
			System.out.println("Enter Student Email: ");
			String Email=scanner.next();
			prepareStatement.setString(3, Email);
			
			System.out.println("Enter Student contact: ");
			String contact=scanner.next();
			prepareStatement.setString(4, contact);
			
			int executeUpdate = prepareStatement.executeUpdate();
			
			
			System.out.println(executeUpdate + " rows affected");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
