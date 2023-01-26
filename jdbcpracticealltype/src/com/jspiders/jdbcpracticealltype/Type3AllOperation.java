package com.jspiders.jdbcpracticealltype;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Type3AllOperation {
	public static void main(String[] args) {
		
		//load file
		String filepath="E:\\WEJM4\\J2EE\\jdbcpracticealltype\\resources\\db_info.properties";
		try {
			FileReader fileReader=new FileReader(filepath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load driver path
			
			Class.forName(properties.getProperty("driver"));
			//open connection
			Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			//create / prepare statemenr
			Statement statement=connection.createStatement();
//			ResultSet resultSet=statement.executeQuery(properties.getProperty("Query"));
//			int  resultSet=statement.executeUpdate(properties.getProperty("Query1"));
			int  resultSet=statement.executeUpdate(properties.getProperty("Query3"));
			
			//process the result
//			while (resultSet.next()) {
//				System.out.println(resultSet.getString(1)+ " || "
//						+resultSet.getString(2)+ " || ");
//			}
			System.out.println(resultSet+"rows affected");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
