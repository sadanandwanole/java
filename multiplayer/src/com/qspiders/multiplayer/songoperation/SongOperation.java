package com.qspiders.multiplayer.songoperation;

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

public class SongOperation {
	private static Connection connection;
	private static Properties properties;
	private static FileReader fileReader;
	private static Statement statement;
	private static String filePath = "E:\\WEJM4\\J2EE\\multiplayer\\Resources\\db_info.properties";
	private static int id;
	private static String name;
	private static String singer;
	private static int duration;
	private static String movie_album;
	private static String lyrics;
	private static Scanner scanner = new Scanner(System.in);
	PreparedStatement prepareStatement;

	public void OpenConnection() {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);

			// load driver class

			Class.forName(properties.getProperty("driverPath"));
			// open connection

			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			// prepare statement
			

			// process result
		} catch (IOException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	

	public void addSong() throws SQLException {

		OpenConnection();
		prepareStatement = connection.prepareStatement(properties.getProperty("Query1"));

		System.out.println("Enter Song Id: ");
		id = scanner.nextInt();
		prepareStatement.setInt(1, id);

		System.out.println("Enter Song Name: ");
		name = scanner.next();
		prepareStatement.setString(2, name);

		System.out.println("Enter Song singerName: ");
		singer = scanner.next();
		prepareStatement.setString(3, singer);

		System.out.println("Enter Song duration: ");
		duration = scanner.nextInt();
		prepareStatement.setInt(4, duration);

		System.out.println("Enter Song movie_album: ");
		movie_album = scanner.next();
		prepareStatement.setString(5, movie_album);

		System.out.println("Enter Song lyrics: ");
		lyrics = scanner.next();
		prepareStatement.setString(6, lyrics);
		
		
		int result = prepareStatement.executeUpdate();
		
		System.out.println(result + "rows affected");
		

	}
	
	public void closeConnecton() {

		try {
			if (connection != null)
				connection.close();
			if (prepareStatement != null) {
				prepareStatement.close();
			}
			if (fileReader != null) {
				fileReader.close();
			}
			if (statement != null) {
				statement.close();
			}

		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeSong() {
		OpenConnection();
		try {
			prepareStatement = connection.prepareStatement(properties.getProperty("Query2"));
			
			
			System.out.println("Enter Song Id: ");
			id = scanner.nextInt();
			prepareStatement.setInt(1, id);
			
			int result = prepareStatement.executeUpdate();
			
			System.out.println(result + "rows affected");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnecton();
		
		
	}
	
	
	public void editSong() {
		OpenConnection();
		
		try {
			
			prepareStatement = connection.prepareStatement(properties.getProperty("Query3"));


			System.out.println("Enter Song Name: ");
			name = scanner.nextLine();
			prepareStatement.setString(1, name);

			System.out.println("Enter Song singerName: ");
			singer = scanner.nextLine();
			prepareStatement.setString(2, singer);

			System.out.println("Enter Song duration: ");
			duration = scanner.nextInt();
			prepareStatement.setInt(3, duration);

			System.out.println("Enter Song movie_album: ");
			movie_album = scanner.nextLine();
			prepareStatement.setString(4, movie_album);

			System.out.println("Enter Song lyrics: ");
			lyrics = scanner.nextLine();
			prepareStatement.setString(5, lyrics);
			
			id = scanner.nextInt();
			prepareStatement.setInt(6, id);
			System.out.println("Enter Song Id: ");
			
			
			
			int result = prepareStatement.executeUpdate();
			
			System.out.println(result + "rows affected");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 closeConnecton();
	}
	
	public void displayAllSong() {
		OpenConnection();
		
		try {
			statement=connection.createStatement();
			
			ResultSet executeQuery = statement.executeQuery(properties.getProperty("displyaAll"));
			
			
			//print all song
			while (executeQuery.next()) {
				System.out.println("Song Id: "+executeQuery.getInt(1)+ " || "
						+ "Song Name: "+executeQuery.getString(2)+ " || "
						+ "Singer Name: "+executeQuery.getString(3)+ " || ");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnecton();
		
	}
	

}
