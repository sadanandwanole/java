package com.jspders.hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspders.hibernate1dto.StudentDTO;

public class StudentDAO {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		
		transaction.begin();
		StudentDTO student = new StudentDTO();
		student.setId(1);
		student.setName("sadanand");
		student.setEmail("sada@gmail.com");
		student.setContact(8080385196l);
		student.setCity("Pune");
		createEntityManager.persist(student);
		transaction.commit();
	}

}
