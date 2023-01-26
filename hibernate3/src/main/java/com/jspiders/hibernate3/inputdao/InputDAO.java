package com.jspiders.hibernate3.inputdao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate3.inputdto.StudentInputDTO;

public class InputDAO {

	private static int id;

	private static String name;

	private static String email;

	private static EntityManagerFactory entityManagerFactory;

	private static EntityManager entityManager;

	private static EntityTransaction transaction;

	private static Scanner scanner = new Scanner(System.in);

	private static int choice;

	public static void main(String[] args) {

		entityManagerFactory = Persistence.createEntityManagerFactory("student");

		entityManager = entityManagerFactory.createEntityManager();

		transaction = entityManager.getTransaction();

		System.out.println("How Many Record You Want To Add .....?");
		choice = scanner.nextInt();

		for (int i = 1; i <= choice; i++) {

			StudentInputDTO dto = new StudentInputDTO();

			transaction.begin();

			System.out.println("Enter Id Of Student : ");
			id = scanner.nextInt();
			dto.setId(id);

			System.out.println("Enter Name Of Student : ");
			name = scanner.next();
			dto.setName(name);

			System.out.println("Enter Email Of Student : ");
			email = scanner.next();
			dto.setEmail(email);

			entityManager.persist(dto);

			transaction.commit();
//			inputDelete();

			
			serch();
		}

	}

	public static void inputDelete() {

		entityManagerFactory = Persistence.createEntityManagerFactory("student");

		entityManager = entityManagerFactory.createEntityManager();

		transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		System.out.println("pleasw enter the id :");
		
		choice=scanner.nextInt();
		
		StudentInputDTO dto=entityManager.find(StudentInputDTO.class, choice);
		entityManager.remove(dto);
		
		transaction.commit();

	}
	
	public static void serch() {
		
		entityManagerFactory=Persistence.createEntityManagerFactory("student");
		entityManager=entityManagerFactory.createEntityManager();
		
		transaction=entityManager.getTransaction();
		
		transaction.begin();
		
		System.out.println("Enter the student id : ");
		choice=scanner.nextInt();
		StudentInputDTO dto=entityManager.find(StudentInputDTO.class, choice);
		
		System.out.println(dto);
		
	entityManager.persist(dto);
	transaction.commit();
		
		
		
	}

}
