package jdbc4.practice.CreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		//load the driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4? user=root & password=root");
			
			//create / prepare statement
			
			Statement statement=connection.createStatement();
			
			long executeLargeUpdate = statement.executeLargeUpdate("create table database1 (name varchar(10), contact varchar (10))");
			
			//process the result
			
			System.out.println(executeLargeUpdate+ "record created....!!!!");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
