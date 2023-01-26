package com.jspiders.jdbcPractice.dynamic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class DynamicInput {
	private static Scanner scanner=new Scanner(System.in);
	private static int id;
	
	//load driver Class
	public static void main(String[] args) {
		
		String filepath="E:\\WEJM4\\J2EE\\jdbcPractice\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filepath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			
			//load the driver class
			
			Class.forName(properties.getProperty("driver"));
			
			
			//opnen connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			
			//cretate / prepare statement
			
			PreparedStatement prepareStatement = connection.prepareStatement(properties.getProperty("Query2"));
			
			
			
			//process the result
			
			System.out.println("Enter student name : ");
			String name=scanner.next();
			prepareStatement.setString(1, name);
			
			
			System.out.println("Enter student id : ");
			id=scanner.nextInt();
			prepareStatement.setInt(2, id);
			
			int executeQuery = prepareStatement.executeUpdate();
			System.out.println(executeQuery + "rows Affected");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
