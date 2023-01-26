package com.jspider.jdbcallprogram.createtable;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcPropertiesInsert {
	public static void main(String[] args) {
		// load properties file
		String filePath="E:\\WEJM4\\J2EE\\jdbcallprogram\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filePath);
			
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load class driver
			
			Class.forName(properties.getProperty("drivePath"));
			
			//open connection
			Connection connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			//create / prepare statement
			
			Statement statement=connection.createStatement();
			int executeQuery = statement.executeUpdate(properties.getProperty("Query1"));
			
			System.out.println(executeQuery + " rows affected");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
