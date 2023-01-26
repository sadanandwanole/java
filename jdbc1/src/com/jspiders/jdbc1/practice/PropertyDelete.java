package com.jspiders.jdbc1.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropertyDelete {
	public static void main(String[] args) {
		String filePath="E:\\WEJM4\\J2EE\\jdbc1\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			
			//load driver class
			
			Class.forName(properties.getProperty("driverPath"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			//create / praper statement
			Statement statement=connection.createStatement();
			
			int executeUpdate = statement.executeUpdate(properties.getProperty("Query4"));
			
			// process update
			
			System.out.println(executeUpdate+" rows affected ");
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
