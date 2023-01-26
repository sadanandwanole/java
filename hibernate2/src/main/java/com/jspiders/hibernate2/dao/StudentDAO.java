package com.jspiders.hibernate2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.jspiders.hibernate2.dto.SudentDTO;

public class StudentDAO {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		
		transaction.begin();
		SudentDTO student =new SudentDTO();
		student.setId(5);
		student.setName("sadanand");
		student.setEmail("sada@gmail.com");
		student.setContact(8080385196l);
		student.setCity("Pune");
		createEntityManager.persist(student);
		transaction.commit();
		
		entityManagerFactory.close();
		createEntityManager.close();
	}

}


