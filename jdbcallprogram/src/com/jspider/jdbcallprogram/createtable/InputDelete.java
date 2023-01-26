package com.jspider.jdbcallprogram.createtable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class InputDelete {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		//load the File
		String filePath="E:\\WEJM4\\J2EE\\jdbcallprogram\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filePath);
			
			Properties properties=new Properties();
			properties.load(fileReader);
			
			
			//load the driver class
			
			Class.forName(properties.getProperty("drivePath"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			//create statement // prepare statement
			
			PreparedStatement prepareStatement = connection.prepareStatement(properties.getProperty("Query5"));
			
			System.out.println("Enter Name: ");
			String name=scanner.nextLine();
			prepareStatement.setString(1, name);
			
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate+ "rows affected");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
