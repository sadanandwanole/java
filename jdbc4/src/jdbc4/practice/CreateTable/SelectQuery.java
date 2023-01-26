package jdbc4.practice.CreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	public static void main(String[] args) {
		
		// load driver class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root & password=root");
			
			//create / prepare statement
			
			Statement statement=connection.createStatement();
			
			ResultSet executeUpdate = statement.executeQuery("select * from student where id=4");
			
			
			// process the result
			
			while (executeUpdate.next()) {
				System.out.println(executeUpdate.getString(1)+" || "
						+executeUpdate.getString(2)+" || "
						+executeUpdate.getString(3)+" || "
						+executeUpdate.getString(4)+" || ");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
