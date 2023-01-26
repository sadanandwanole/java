package jdbc4.practice.input.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class DeleteInput {
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		String filePath="E:\\WEJM4\\J2EE\\jdbc4\\resources\\db_info.properties";;
		
		try {
			FileReader fileReader=new FileReader(filePath);
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//load driver
			
			Class.forName(properties.getProperty("Driver"));
			
			//open connection
			
			Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			
			//create or prepare statement
			
			PreparedStatement prepareStatement = connection.prepareStatement(properties.getProperty("Query3"));
			
			//result process
			
			System.out.println("Enter Your Id");
			int id=scanner.nextInt();
			prepareStatement.setInt(1, id);
			
			
			
			int executeUpdate = prepareStatement.executeUpdate();
			
			System.out.println(executeUpdate+"rows affected...!!!");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
