package com.jspiders.jdbc1.practice.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesUpdate {
	public static void main(String[] args) {
		String filePath="E:\\WEJM4\\J2EE\\jdbc1\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filePath);
			
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load the driver class
			
			Class.forName(properties.getProperty("driverPath"));
			
			// open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			//create / prapare statement
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(properties.getProperty("Query3"));
			
			// process result
			
			System.out.println(result + " rows affected" );
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
