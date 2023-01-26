package com.jspiders.jdbcPractice.ThirdWay;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ThirdWay {
	public static void main(String[] args) {
		//load the property file
		
		try {
			FileReader fileReader=new FileReader("E:\\WEJM4\\J2EE\\jdbcPractice\\resources\\db_info.properties");
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load the driver class
			
			Class.forName(properties.getProperty("driver"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			
			//create / prepare statement
			
			Statement statement=connection.createStatement();
			ResultSet executeQuery = statement.executeQuery(properties.getProperty("Query"));
			
			//process the result
			
			while (executeQuery.next()) {
				System.out.println(executeQuery.getString(1)+ " || "
						+executeQuery.getString(2)+ " || "
						+executeQuery.getString(3)+ " || ");
			}
			
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
