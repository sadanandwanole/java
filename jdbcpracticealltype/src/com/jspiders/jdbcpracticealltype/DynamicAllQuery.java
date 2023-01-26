package com.jspiders.jdbcpracticealltype;

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

public class DynamicAllQuery {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		//load the file
		String filepath="E:\\WEJM4\\J2EE\\jdbcpracticealltype\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filepath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load driver class
			
			Class.forName(properties.getProperty("driver"));
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			
			//create statement / prepare statement
			
//			PreparedStatement statement=connection.prepareStatement(properties.getProperty("DynamicQuery1"));
//			PreparedStatement statement=connection.prepareStatement(properties.getProperty("DynamicQuery2"));
//			System.out.println("Enther the name");
//			String name=scanner.next();
//			statement.setString(1, name);
//			
//			System.out.println("Enther the city");
//			String city=scanner.next();
//			statement.setString(2, name);
//			
//			
////			ResultSet resultSet=statement.executeQuery();
//			int result=statement.executeUpdate();
			
			//process the result
			
//			while (resultSet.next()) {
//				System.out.println(resultSet.getString(1)+" || "+
//						resultSet.getString(2)+" || ");
//			}
//			PreparedStatement statement=connection.prepareStatement(properties.getProperty("DynamicQuery3"));
//			System.out.println("Enter The Name");
//			String name=scanner.next();
//			statement.setString(1, name);
//			
//			int result=statement.executeUpdate();
			
			
			PreparedStatement statement = connection.prepareStatement(properties.getProperty("DynamicQuery4"));
			System.out.println("Enter the name");
			String name=scanner.next();
			statement.setString(1,name);
			
			System.out.println("Enter the city");
			String city=scanner.next();
			statement.setString(2, city);
			
			int result=statement.executeUpdate();
			
			System.out.println(result+"rows affected");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
