package com.jspiders.jdbc1.practice.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcFileProperties {
	public static void main(String[] args) {
		//load the File Filereader/properties/load
		
		String filePath="E:\\WEJM4\\J2EE\\jdbc1\\resources\\db_info.properties";
		
		try {
			FileReader fileReader=new FileReader(filePath);
			
			Properties properties=new Properties();
			properties.load(fileReader);
			//load the driver class
			Class.forName(properties.getProperty("driverPath"));
			
			// Open connection
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			// create statement/prepare statement
			
			Statement statement=connection.createStatement();
			ResultSet executeQuery = statement.executeQuery(properties.getProperty("Query"));
			
			//process result
			
			while (executeQuery.next()) {
				System.out.println(executeQuery.getString(1)+ " || "
						+ executeQuery.getString(2)+ " || "
						+ executeQuery.getString(3)+ " || "
						+ executeQuery.getString(4)+ " || ");
			}
			
			
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
