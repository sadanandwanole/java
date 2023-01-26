package com.jspiders.hibernate3.select;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate3.dto.Student1DTO;

public class HibernateSelect {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		Student1DTO student1dto=entityManager.find(Student1DTO.class, 1);
		
		//System.out.println(student1dto);
		
		// update
		
		student1dto.setDOB("10/10/2000");
		entityManager.persist(student1dto);
		entityTransaction.commit();
		
		
		
	}

}
