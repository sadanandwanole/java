package com.jspiders.hibernatecasestudy.songoperation;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.hibernatecasestudy.song.SongDatabase;

public class SongOperation {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Scanner scanner;
	private static int choice;
	private static int id;
	private static String name;
	private static String singer;
	private static double duration;
	private static String movie;
	private static String lyrics;
	private static Query query;
	private static String jpql;
	
	
	public static void openConnection() {
		
		factory=Persistence.createEntityManagerFactory("student");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
		scanner=new Scanner(System.in);
	}
	public static void closeConnection() {
		
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
	}
	
	public static void addSong() {
		openConnection();
		
		
		
		System.out.println("How Many Song You Want To Add ?????");
		choice=scanner.nextInt();
		
		for (int i = 1; i <= choice; i++) {
			transaction.begin();
			
			SongDatabase database=new SongDatabase();
			System.out.println("Enter Song Id :");
			id=scanner.nextInt();
			database.setId(id);
			
			
			System.out.println("Enter Song Name :");
			name=scanner.next();
			database.setName(name);
			
			
			System.out.println("Enter Song Singer :");
			singer=scanner.next();
			database.setSinger(singer);
			
			System.out.println("Enter Song Duration :");
			duration=scanner.nextDouble();
			database.setDuration(duration);
			
			
			System.out.println("Enter Song  movieName :");
			movie=scanner.next();
			database.setMovie(movie);
			
			System.out.println("Enter Song lyrics :");
			lyrics=scanner.next();
			database.setLyrics(lyrics);
			
			manager.persist(database);
			transaction.commit();
			
		}
		
		
		closeConnection();
	}
	
	public static void deleteSong() {
		
		openConnection();
		transaction.begin();
		System.out.println("Please Enter The Id Of The Song : ");
		id=scanner.nextInt();
		SongDatabase find = manager.find(SongDatabase.class, id);
		manager.remove(find);
		transaction.commit();
		closeConnection();
		
		
	}
	
	public static void searchSong() {
		
		openConnection();
		transaction.begin();
		System.out.println("Please enter the id :");
		id=scanner.nextInt();
		SongDatabase find = manager.find(SongDatabase.class, id);
		System.out.println(find);
		transaction.commit();
		closeConnection();
		
		
	}
	
	public static void displayAllSong (){
		
		openConnection();
		transaction.begin();
		jpql="from SongDatabase";
		 query = manager.createQuery(jpql);
		 List<SongDatabase> resultList = query.getResultList();
		 
		 for (SongDatabase songDatabase : resultList) {
			System.out.println(songDatabase);
		}
		
	
		
		
		
		
	}

	public static void editSong() {
		openConnection();
		transaction.begin();
		
		System.out.println("please Enter The id of the Song :  ");
		id=scanner.nextInt();
		SongDatabase database = manager.find(SongDatabase.class, id);
		System.out.println("Enter Song Name :");
		name=scanner.next();
		database.setName(name);
		
		
		System.out.println("Enter Song Singer :");
		singer=scanner.next();
		database.setSinger(singer);
		
		System.out.println("Enter Song Duration :");
		duration=scanner.nextDouble();
		database.setDuration(duration);
		
		
		System.out.println("Enter Song  movieName :");
		movie=scanner.next();
		database.setMovie(movie);
		
		System.out.println("Enter Song lyrics :");
		lyrics=scanner.next();
		database.setLyrics(lyrics);
		
		manager.persist(database);
		transaction.commit();
		closeConnection();
		
	}
	
	public static void random() {
		
		double random = Math.random();
		int random1=(int)random;
		int value=(int) ((int)++random1*Math.random()*100);
//		System.out.println(value);
		System.out.println("The Song Number "+value + " is playing now");
	}
		
		
	
}
