package com.jspiders.hibernatemain.update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatemain.maindto.MainDTO;

public class HibernateUpdate {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		MainDTO dto=entityManager.find(MainDTO.class, 1);
		
		dto.setSallary(1);
		entityManager.persist(dto);
		
		entityTransaction.commit();
		
		
		
	}

}
