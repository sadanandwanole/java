package jdbc4.practice.crud.resources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SelectQueryResoursePro {
	public static void main(String[] args) {
		
		String filePath="E:\\WEJM4\\J2EE\\jdbc4\\resources\\db_info.properties";
		
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			
			//driver path
			
			Class.forName(properties.getProperty("Driver"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			
			//create / preapare statement
			
			Statement statement=connection.createStatement();
			ResultSet executeQuery = statement.executeQuery(properties.getProperty("Query1"));
			
			//process the result
			
			while (executeQuery.next()) {
				
				System.out.println(executeQuery.getString(1)+ " || "
						+executeQuery.getString(2)+ " || "
						+executeQuery.getString(3)+ " || "
						+executeQuery.getString(4)+ " || ");
				
			}
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
