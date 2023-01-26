package com.jspiders.jdbc.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Practice {
	private static String db_url="jdbc:mysql://localhost:3306/wejm4";
	private static String filePath="E:\\WEJM4\\J2EE\\jdbc\\resources\\db_info.properties";
	public static void main(String[] args) {
		// load the Driver Class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			Connection connection=DriverManager.getConnection(db_url,properties);
			Statement statement=connection.createStatement();
			int result = statement.executeUpdate("insert into student4 values (4,'amruta','amruta@gmail.com',78787878)");
			System.out.println(result+"rows afected");
			fileReader.close();
			connection.close();
			statement.close();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
