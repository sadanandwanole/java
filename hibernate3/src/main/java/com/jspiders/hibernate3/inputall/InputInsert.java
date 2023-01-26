package com.jspiders.hibernate3.inputall;

import java.awt.Choice;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InputInsert {
	
	private static EntityManagerFactory entityManagerFactory;
	
	private static EntityManager entityManager;
	
	private static EntityTransaction entityTransaction;
	
	private static int choice;
	
	private static int id;
	private static String name;
	private static long contact;
	
	private static Scanner scanner=new Scanner(System.in);
	
	public static void openConnection() {
		
		entityManagerFactory=Persistence.createEntityManagerFactory("student");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	
	public static void closeConnection() {
		
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		
	}
	
	public static void Insert() {
		
		openConnection();
		
		System.out.println("How Much Record You Want to Inser....!!!!");
		choice=scanner.nextInt();
		
		for (int i = 0; i <= choice; i++) {
							entityTransaction.begin();
			
			HistoryStudent student=new HistoryStudent();
			System.out.println("Enter Id :");
			id=scanner.nextInt();
			student.setId(id);
			
			
			System.out.println("Enter name :");
			name=scanner.next();
			student.setName(name);
			
			
			System.out.println("Enter Contact :");
			contact=scanner.nextLong();
			student.setContact(contact);
			
			entityManager.persist(student);
			entityTransaction.commit();
			
			
			
			
		}
		
	}
	
	public static void delete() {
		openConnection();
		entityTransaction.begin();
		System.out.println("Pleasw enter Student Id :");
		choice=scanner.nextInt();
		HistoryStudent student=entityManager.find(HistoryStudent.class, choice);
		
		entityManager.remove(student);
		entityTransaction.commit();
		
		closeConnection();
		
		
		
	}
	
	public static void search() {
		
		openConnection();
		System.out.println("Pleasw enter Student Id :");
		choice=scanner.nextInt();
		HistoryStudent student=entityManager.find(HistoryStudent.class, choice);
		
		System.out.println(student);
		closeConnection();
		
	}
	
	public static void update() {
		openConnection();
		entityTransaction.begin();
		System.out.println("Please Enter The Id ......!");
		choice=scanner.nextInt();
		
		HistoryStudent student1=entityManager.find(HistoryStudent.class, choice);
		
//		System.out.println("Enter Id :");
//		id=scanner.nextInt();
//		student1.setId(id);
		
		
		System.out.println("Enter name :");
		name=scanner.next();
		student1.setName(name);
		
		
		System.out.println("Enter Contact :");
		contact=scanner.nextLong();
		student1.setContact(contact);
		
		entityManager.persist(student1);
		entityTransaction.commit();
		
		closeConnection();
		
		
	}

}
