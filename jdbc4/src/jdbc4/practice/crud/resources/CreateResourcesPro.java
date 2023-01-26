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

public class CreateResourcesPro {
	public static void main(String[] args) {
		
		String filePath="E:\\WEJM4\\J2EE\\jdbc4\\resources\\db_info.properties";
		
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load driver class
			
			Class.forName(properties.getProperty("Driver"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			
			//create / prepare statement
			
			Statement statement=connection.createStatement();
			int executeQuery = statement.executeUpdate(properties.getProperty("Query"));
			
			//result process
			
			System.out.println("Record Created........!!!!!!!!");
			
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
