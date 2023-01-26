package com.jspiders.hibernate3.onetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FatherChildDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	
	private static EntityManager entityManager;
	
	private static EntityTransaction entityTransaction;
	
	
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
		if (entityTransaction != null) {
			entityTransaction.rollback();
		}
	}
	
	
	public static void main(String[] args) {
		
		openConnection();
		entityTransaction.begin();
		
		ChildDTO dto=new ChildDTO();
		dto.setId(1);
		dto.setName("Neha");
		dto.setAge(19);
		dto.setContact(909090909);
		entityManager.persist(dto);
		
		
		ChildDTO dto1=new ChildDTO();
		dto1.setId(2);
		dto1.setName("Arijit");
		dto1.setAge(23);
		dto1.setContact(123456);
		entityManager.persist(dto1);
		
		List<ChildDTO> children = Arrays.asList(dto,dto1);
		
		FatherDTO dto2=new FatherDTO();
		dto2.setId(1);
		dto2.setName("Kiran");
		dto2.setAge(30);
		
		dto2.setChildren(children);
		entityManager.persist(dto2);
		
		entityTransaction.commit();
		
		closeConnection();
		
		
		
		
	}

}
