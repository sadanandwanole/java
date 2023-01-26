package com.jspiders.jdbcprocedure.main;

import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcCallAble {
	private static String filePath="E:\\WEJM4\\J2EE\\jdbcprocedure\\resources\\db_info.properties";
	public static void main(String[] args) {
		//load the file
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load the driver path
			
			Class.forName(properties.getProperty("driverPath"));
			//open connection
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			// prepare statement / create statement/ call statement
			CallableStatement prepareCall = connection.prepareCall(properties.getProperty("Query1"));
			
			ResultSet executeQuery = prepareCall.executeQuery();
			//process result
			
			while (executeQuery.next()) {
				System.out.println(executeQuery.getString(1)+ " || " 
						+ executeQuery.getString(2)+ " || " 
						+ executeQuery.getString(3)+ " || " 
						+ executeQuery.getString(4)+ " || " );
			}
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
