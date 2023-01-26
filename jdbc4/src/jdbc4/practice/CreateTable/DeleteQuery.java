package jdbc4.practice.CreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
	public static void main(String[] args) {
		
		//load driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			//create / prepare statement
			
			Statement statement=connection.createStatement();
			
			int executeQuery = statement.executeUpdate("delete from student where id=4");
			
			System.out.println(executeQuery+"rows affected");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
