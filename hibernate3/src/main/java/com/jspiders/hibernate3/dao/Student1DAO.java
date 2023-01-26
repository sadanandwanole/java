package com.jspiders.hibernate3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate3.dto.Student1DTO;

public class Student1DAO {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = createEntityManager.getTransaction();
		
		transaction.begin();
		
		Student1DTO dto=new Student1DTO();
		
		dto.setId(1);
		
		dto.setName("sada");
		dto.setContact(8080385196l);
		dto.setDOB("10-09-2000");
		createEntityManager.persist(dto);
		transaction.commit();
		
		
	}

}
