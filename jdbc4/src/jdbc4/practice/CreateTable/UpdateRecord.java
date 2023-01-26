package jdbc4.practice.CreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		//load driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//open conn
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			//create statement / prepare statement
			
			Statement statement=connection.createStatement();
			int executeUpdate = statement.executeUpdate("update student set name='manisha' where id=4");
			
			//process the result
			
			System.out.println(executeUpdate+"rows affected");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
