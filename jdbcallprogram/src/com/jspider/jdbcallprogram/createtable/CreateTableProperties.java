package com.jspider.jdbcallprogram.createtable;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CreateTableProperties {
	public static void main(String[] args) {
		
		// load the properties
		String filePath="E:\\WEJM4\\J2EE\\jdbcallprogram\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load the driver class
			
			Class.forName(properties.getProperty("drivePath"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			// create statement or prepare statement
			
			Statement statement=connection.createStatement();
			int executeQuery = statement.executeUpdate(properties.getProperty("Query"));
			System.out.println("table created.....!");
			
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
