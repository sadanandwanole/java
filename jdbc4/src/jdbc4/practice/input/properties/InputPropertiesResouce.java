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

public class InputPropertiesResouce {
		private static Scanner scanner=new Scanner(System.in);
	
			public static void main(String[] args) {
				
				String filePath="E:\\WEJM4\\J2EE\\jdbc4\\resources\\db_info.properties";
				
				try {
					FileReader fileReader=new FileReader(filePath);
					Properties properties=new Properties();
					properties.load(fileReader);
					
					//load driver path
					
					Class.forName(properties.getProperty("Driver"));
					
					// open connection
					
					Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties);
					
					//create / prepare statement
					
					PreparedStatement prepareStatement = connection.prepareStatement(properties.getProperty("Query2"));
					
					System.out.println("Enter Your Id");
					int id=scanner.nextInt();
					prepareStatement.setInt(1, id);
					
					
					System.out.println("Enter Your Name");
					String name=scanner.next();
					prepareStatement.setString(2, name);
					
					
					System.out.println("Enter Your Email");
					String email=scanner.next();
					prepareStatement.setString(3, email);
					
					
					System.out.println("Enter Your Contact");
					long contact=scanner.nextLong();
					prepareStatement.setLong(4, contact);
					
					
					int executeQuery = prepareStatement.executeUpdate();
					
					System.out.println("rows updated.....!!!");
				
					
					
				} catch (IOException | ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
}
